package kz.beeline.beeplay.beeplay.service.impl;


import kz.beeline.beeplay.beeplay.entity.dto.StreamDTO;
import kz.beeline.beeplay.beeplay.entity.dto.mapper.StreamMapper;
import kz.beeline.beeplay.beeplay.repository.StreamRepository;
import kz.beeline.beeplay.beeplay.service.StreamService;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

@Service
public class StreamServiceImpl implements StreamService {
    private final StreamRepository streamRepository;
    private final StreamMapper streamMapper;

    public StreamServiceImpl(StreamRepository streamRepository, StreamMapper streamMapper) {
        this.streamRepository = streamRepository;
        this.streamMapper = streamMapper;
    }

    @Override
    public Page<StreamDTO> getAll(Integer page, Integer size) {
        return null;
    }

    @Override
    public StreamDTO getBySlug(String slug) throws IllegalStateException {
        return null;
    }
}
