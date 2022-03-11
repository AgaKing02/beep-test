package kz.beeline.beeplay.beeplay.service;


import kz.beeline.beeplay.beeplay.entity.dto.ContestDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ContestService {

    Page<ContestDTO> getContestPage(Pageable pageable);

    ContestDTO getContestBySlug(String slug) throws IllegalStateException;

    Page<ContestDTO> getContestPage(Integer page, Integer size);
}
