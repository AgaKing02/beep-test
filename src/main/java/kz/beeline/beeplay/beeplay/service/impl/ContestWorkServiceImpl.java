package kz.beeline.beeplay.beeplay.service.impl;


import kz.beeline.beeplay.beeplay.entity.dto.ContestWorkDTO;
import kz.beeline.beeplay.beeplay.entity.dto.mapper.ContestWorkMapper;
import kz.beeline.beeplay.beeplay.repository.ContestWorkRepository;
import kz.beeline.beeplay.beeplay.service.ContestWorkService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContestWorkServiceImpl implements ContestWorkService {
    private final ContestWorkMapper contestWorkMapper;
    private final ContestWorkRepository contestWorkRepository;

    public ContestWorkServiceImpl(ContestWorkMapper contestWorkMapper, ContestWorkRepository contestWorkRepository) {
        this.contestWorkMapper = contestWorkMapper;
        this.contestWorkRepository = contestWorkRepository;
    }


    @Override
    public List<ContestWorkDTO> getByContest(Long contestId) {
        return null;
    }

    @Override
    public void save(ContestWorkDTO contestWorkDTO) {

    }

    @Override
    public Boolean existsByUserId(Long contestId, Long id) {
        return null;
    }
}
