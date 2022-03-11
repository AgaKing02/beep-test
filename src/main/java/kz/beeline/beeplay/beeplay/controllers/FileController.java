package kz.beeline.beeplay.beeplay.controllers;


import kz.beeline.beeplay.beeplay.service.FileStorageService;
import kz.beeline.beeplay.beeplay.service.impl.FileStorageServiceImpl;
import org.slf4j.Logger;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.net.MalformedURLException;

@RestController
//@Api(value = "File Resources",description = "Crud Operations")
public class FileController {

    private final FileStorageService fileStorageService;
    private static final Logger log = org.slf4j.LoggerFactory.getLogger(FileStorageServiceImpl.class);


    public FileController(FileStorageService fileStorageService) {
        this.fileStorageService = fileStorageService;
    }

    @GetMapping("/downloadFile")
//    @ApiOperation(value = "Get file as resource",response = Resource.class)
    public ResponseEntity<Resource> downloadFile(@RequestParam("file") String fileName, HttpServletRequest request) {
        // Load file as Resource
        Resource resource = null;
        try {
            resource = fileStorageService.loadFileAsResource(fileName);
        } catch (MalformedURLException e) {
            log.error("Error", e);
        }

        // Try to determine file's content type
        String contentType = null;
        try {
            contentType = request.getServletContext().getMimeType(resource.getFile().getAbsolutePath());
        } catch (IOException ex) {
            log.info("Could not determine file type.");
        }

        // Fallback to the default content type if type could not be determined
        if(contentType == null) {
            contentType = "application/octet-stream";
        }

        return ResponseEntity.ok()
                .contentType(MediaType.parseMediaType(contentType))
                .header(HttpHeaders.CONTENT_DISPOSITION, "inline; filename=\"" + resource.getFilename() + "\"")
                .body(resource);
    }

}
