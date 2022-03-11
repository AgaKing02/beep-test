package kz.beeline.beeplay.beeplay.entity.dto.mapper;


import kz.beeline.beeplay.beeplay.entity.SliderSlide;
import kz.beeline.beeplay.beeplay.entity.dto.SliderSlideDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface SliderSlideMapper extends EntityMapper<SliderSlideDTO, SliderSlide>{
    @Mapping(target = "id", source = "id")
    @Mapping(target = "description", source = "description")
    @Mapping(target = "image", source = "image")
    SliderSlideDTO toDto(SliderSlide slider);
}
