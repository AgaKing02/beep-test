package kz.beeline.beeplay.beeplay.entity.dto.mapper;

import kz.beeline.beeplay.beeplay.entity.Social;
import kz.beeline.beeplay.beeplay.entity.dto.SocialDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface SocialMapper extends EntityMapper<SocialDTO, Social>{
    @Mapping(target = "id",source = "id")
    @Mapping(target = "name",source = "name")
    @Mapping(target = "link",source = "link")
    @Mapping(target = "icon",source = "icon")
    SocialDTO toDto(Social social);
}
