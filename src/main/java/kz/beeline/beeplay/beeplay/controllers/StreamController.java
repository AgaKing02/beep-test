package kz.beeline.beeplay.beeplay.controllers;


import kz.beeline.beeplay.beeplay.entity.dto.StreamDTO;
import kz.beeline.beeplay.beeplay.service.StreamService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
//@Api(value = "Stream Resources", description = "Crud Operations")
public class StreamController {

    private final StreamService service;

    public StreamController(StreamService service) {
        this.service = service;
    }

    @GetMapping("/streams")
//    @ApiOperation(value = "Get all streams with pages", response = Iterable.class)
    public ResponseEntity<List<StreamDTO>> getStreams(@RequestParam(name = "page_size", required = false, defaultValue = "10") Integer size,
                                                      @RequestParam(name = "page", required = false, defaultValue = "0") Integer page) {

        return ResponseEntity.ok(service.getAll(page, size).getContent());

    }

    @GetMapping("/streams/{slug}")
//    @ApiOperation(value = "Get contest with slug", response = StreamDTO.class)
    public ResponseEntity<?> getStream(@PathVariable("slug") String slug) {
        StreamDTO streamDTO;
        try {
            streamDTO = service.getBySlug(slug);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Stream doesn't exist");
        }
        return ResponseEntity.ok(streamDTO);
    }

}
