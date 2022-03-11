package kz.beeline.beeplay.beeplay.service.impl;


import kz.beeline.beeplay.beeplay.entity.dto.StreamCategoryDTO;
import kz.beeline.beeplay.beeplay.entity.dto.mapper.StreamCategoryMapper;
import kz.beeline.beeplay.beeplay.repository.StreamCategoryRepository;
import kz.beeline.beeplay.beeplay.service.StreamCategoryService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StreamCategoryServiceImpl implements StreamCategoryService {
    private final StreamCategoryRepository streamCategoryRepository;
    private final StreamCategoryMapper categoryMapper;

    public StreamCategoryServiceImpl(StreamCategoryRepository streamCategoryRepository, StreamCategoryMapper categoryMapper) {
        this.streamCategoryRepository = streamCategoryRepository;
        this.categoryMapper = categoryMapper;
    }

    @Override
    public List<StreamCategoryDTO> getAllCategories() {
        return null;
    }

    @Override
    public StreamCategoryDTO getBySlug(String slug) throws Exception {
        return null;
    }
}
