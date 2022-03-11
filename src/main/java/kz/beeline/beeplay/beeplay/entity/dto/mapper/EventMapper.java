package kz.beeline.beeplay.beeplay.entity.dto.mapper;

import kz.beeline.beeplay.beeplay.entity.Event;
import kz.beeline.beeplay.beeplay.entity.dto.EventDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

/**
 * Mapper for the entity {@link Event} and its DTO {@link EventDTO}.
 */
@Mapper(componentModel = "spring", uses = { EventCategoryMapper.class, SliderSlideMapper.class ,ImageMapper.class})
public interface EventMapper extends EntityMapper<EventDTO, Event> {
    @Mapping(target = "event_type", source = "event_type")
    @Mapping(target = "slider", source = "slider")
    @Mapping(target = "image",source = "image")
    EventDTO toDto(Event s);
}

