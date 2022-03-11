package kz.beeline.beeplay.beeplay.service;


import kz.beeline.beeplay.beeplay.entity.dto.StreamCategoryDTO;

import java.util.List;

public interface StreamCategoryService {
    List<StreamCategoryDTO> getAllCategories();

    StreamCategoryDTO getBySlug(String slug) throws Exception;
}
