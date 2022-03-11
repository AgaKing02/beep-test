package kz.beeline.beeplay.beeplay.entity.dto.mapper;


import kz.beeline.beeplay.beeplay.entity.EventType;
import kz.beeline.beeplay.beeplay.entity.dto.EventTypeDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

/**
 * Mapper for the entity {@link EventType} and its DTO {@link EventTypeDTO}.
 */
@Mapper(componentModel = "spring", uses = {})
public interface EventCategoryMapper extends EntityMapper<EventTypeDTO, EventType> {
    @Mapping(target = "id", source = "id")
    @Mapping(target = "title", source = "title")
    EventTypeDTO toDto(EventType eventType);
}