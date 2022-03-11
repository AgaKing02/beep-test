package kz.beeline.beeplay.beeplay.service;


import kz.beeline.beeplay.beeplay.entity.dto.EventDTO;
import org.springframework.data.domain.Page;

public interface EventService {
    Page<EventDTO> getEvents(Integer page, Integer size);
    EventDTO getEventBySlug(String slug) throws IllegalStateException;
}
