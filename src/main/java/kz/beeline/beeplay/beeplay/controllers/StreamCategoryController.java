package kz.beeline.beeplay.beeplay.controllers;


import kz.beeline.beeplay.beeplay.entity.dto.StreamCategoryDTO;
import kz.beeline.beeplay.beeplay.service.StreamCategoryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/api/v1")
public class StreamCategoryController {
    private final StreamCategoryService service;


    public StreamCategoryController(StreamCategoryService service) {
        this.service = service;
    }

    @GetMapping("/stream-categories")
    public ResponseEntity<List<StreamCategoryDTO>> getAllCategories() {
        List<StreamCategoryDTO> allCategories = service.getAllCategories();
        return ResponseEntity.ok(Objects.requireNonNullElseGet(allCategories, ArrayList::new));
    }

    @GetMapping("/stream-categories/{slug}")
    public ResponseEntity<?> getBySlug(@PathVariable(name = "slug") String slug) {
        StreamCategoryDTO streamCategoryDTO;
        try {
            streamCategoryDTO = service.getBySlug(slug);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Stream Category not found " + slug);
        }
        return ResponseEntity.ok(streamCategoryDTO);

    }
}
