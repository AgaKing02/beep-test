package kz.beeline.beeplay.beeplay.service.impl;


import kz.beeline.beeplay.beeplay.entity.dto.EventDTO;
import kz.beeline.beeplay.beeplay.entity.dto.mapper.EventMapper;
import kz.beeline.beeplay.beeplay.repository.EventRepository;
import kz.beeline.beeplay.beeplay.service.EventService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class EventServiceImpl implements EventService {
    private final EventRepository eventRepository;
    private final EventMapper eventMapper;

    public EventServiceImpl(EventRepository eventRepository, EventMapper eventMapper) {
        this.eventRepository = eventRepository;
        this.eventMapper = eventMapper;
    }


    @Override
    public Page<EventDTO> getEvents(Integer page, Integer size) {
        return null;
    }

    @Override
    public EventDTO getEventBySlug(String slug) throws IllegalStateException {
        return null;
    }
}
