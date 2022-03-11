package kz.beeline.beeplay.beeplay.entity.dto.mapper;


import kz.beeline.beeplay.beeplay.entity.Link;
import kz.beeline.beeplay.beeplay.entity.dto.LinkDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = {})
public interface LinkMapper extends EntityMapper<LinkDTO, Link>{
    @Mapping(target = "id", source = "id")
    @Mapping(target = "link", source = "link")
    @Mapping(target = "title", source = "title")
    LinkDTO toDto(Link link);
}
