package kz.beeline.beeplay.beeplay.service;

import kz.beeline.beeplay.beeplay.entity.dto.StreamDTO;
import org.springframework.data.domain.Page;

public interface StreamService {
    Page<StreamDTO> getAll(Integer page, Integer size);
    StreamDTO getBySlug(String slug) throws IllegalStateException;
}
