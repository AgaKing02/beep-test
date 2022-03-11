package kz.beeline.beeplay.beeplay.entity.dto.mapper;


import kz.beeline.beeplay.beeplay.entity.Partner;
import kz.beeline.beeplay.beeplay.entity.dto.PartnerDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.Set;

@Mapper(componentModel = "spring", uses = {})
public interface PartnerMapper extends EntityMapper<PartnerDTO, Partner> {
    @Mapping(target = "id", source = "id")
    @Mapping(target = "title", source = "title")
    @Mapping(target = "logo", source = "logo")
    @Mapping(target = "link", source = "link")
    Set<PartnerDTO> toDto(Set<Partner> sponsor);
}