package kz.beeline.beeplay.beeplay.service;


import kz.beeline.beeplay.beeplay.entity.dto.ContestWorkDTO;

import java.util.List;

public interface ContestWorkService {
    List<ContestWorkDTO> getByContest(Long contestId);

    void save(ContestWorkDTO contestWorkDTO);

    Boolean existsByUserId(Long contestId,Long id);
}
