package kz.beeline.beeplay.beeplay.entity.dto.mapper;


import kz.beeline.beeplay.beeplay.entity.Contest;
import kz.beeline.beeplay.beeplay.entity.dto.ContestDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring", uses = { JuryMapper.class, PartnerMapper.class})
public interface ContestMapper extends EntityMapper<ContestDTO, Contest>{
    @Mapping(target = "jury", source = "jury")
    @Mapping(target = "partners", source = "partners")
    @Mapping(target = "image",source = "image")
    ContestDTO toDto(Contest s);
}
