package kz.beeline.beeplay.beeplay.service.impl;


import kz.beeline.beeplay.beeplay.entity.dto.ContestDTO;
import kz.beeline.beeplay.beeplay.entity.dto.mapper.ContestMapper;
import kz.beeline.beeplay.beeplay.repository.ContestRepository;
import kz.beeline.beeplay.beeplay.service.ContestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ContestServiceImpl implements ContestService {
    private final ContestRepository contestRepository;
    @Autowired
    private final ContestMapper contestMapper;

    public ContestServiceImpl(ContestRepository contestRepository, ContestMapper contestMapper) {
        this.contestRepository = contestRepository;
        this.contestMapper = contestMapper;
    }


    @Override
    public Page<ContestDTO> getContestPage(Pageable pageable) {
        return contestRepository.findAll(pageable).map(contestMapper::toDto);
    }

    @Override
    public ContestDTO getContestBySlug(String slug) throws IllegalStateException {
        return contestMapper.toDto(contestRepository.findContestBySlug(slug));
    }

    @Override
    public Page<ContestDTO> getContestPage(Integer page, Integer size) {
        return contestRepository.findAll(PageRequest.of(page,size)).map(contestMapper::toDto);

    }
}
