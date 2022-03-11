package kz.beeline.beeplay.beeplay.entity.dto.mapper;


import kz.beeline.beeplay.beeplay.entity.Image;
import kz.beeline.beeplay.beeplay.entity.dto.ImageDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ImageMapper extends EntityMapper<ImageDTO, Image>{
    @Mapping(target = "id", source = "id")
    @Mapping(target = "large", source = "large")
    @Mapping(target = "small",source = "small")
    ImageDTO toDto(Image image);
}
