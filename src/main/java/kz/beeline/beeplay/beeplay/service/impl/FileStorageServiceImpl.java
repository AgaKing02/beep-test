package kz.beeline.beeplay.beeplay.service.impl;


import kz.beeline.beeplay.beeplay.service.FileStorageService;
import org.slf4j.Logger;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.io.File;
import java.net.MalformedURLException;
import java.nio.file.Path;
import java.nio.file.Paths;

@Service
public class FileStorageServiceImpl implements FileStorageService {
    private static final Logger log = org.slf4j.LoggerFactory.getLogger(FileStorageServiceImpl.class);
    private Path fileStorageLocation;

    @PostConstruct
    public void init() {
        log.info("FileStorage is defined ");
        this.fileStorageLocation = Paths.get("").toAbsolutePath().normalize();
    }

    @Override
    public Resource loadFileAsResource(String fileName) throws MalformedURLException {
        Path filePath = this.fileStorageLocation.resolve(fileName).normalize();
        return new UrlResource(filePath.toUri());

    }

    @Override
    public String saveFileToDirectory(String path, File file) {
        return null;
    }

    private class MyFileNotFoundException extends Throwable {
        public MyFileNotFoundException(String s) {
            super(s);
        }

        public MyFileNotFoundException(String s, MalformedURLException ex) {
            super(s, ex);
        }
    }
}
