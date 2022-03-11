package kz.beeline.beeplay.beeplay.controllers;

import kz.beeline.beeplay.beeplay.entity.dto.EventDTO;
import kz.beeline.beeplay.beeplay.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
//@Api(value = "Event Resources",description = "Crud Operations")
public class EventController {
    @Autowired
    private final EventService eventService;

    public EventController(EventService eventService) {
        this.eventService = eventService;
    }

    @GetMapping("/events")
//    @ApiOperation(value = "Get all events with pages",response = Iterable.class)
    public ResponseEntity<List<EventDTO>> getAllContests(
            @RequestParam(name = "page_size", required = false, defaultValue = "10") Integer size,
            @RequestParam(name = "page", required = false, defaultValue = "0") Integer page) {
        return ResponseEntity.ok(eventService.getEvents(page, size).getContent());
    }

    @GetMapping("/events/{slug}")
//    @ApiOperation(value = "Get contest with slug",response = EventDTO.class)
    public ResponseEntity<?> getContestBySlug(@PathVariable("slug") String slug) {
        EventDTO eventDTO;
        try {
            eventDTO = eventService.getEventBySlug(slug);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Event doesn't exist");
        }
        return ResponseEntity.ok(eventDTO);
    }
}
