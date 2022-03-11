package kz.beeline.beeplay.beeplay.entity.dto.mapper;


import kz.beeline.beeplay.beeplay.entity.Jury;
import kz.beeline.beeplay.beeplay.entity.dto.JuryDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.Set;

/**
 * Mapper for the entity {@link Jury} and its DTO {@link JuryDTO}.
 */
@Mapper(componentModel = "spring")
public interface JuryMapper extends EntityMapper<JuryDTO, Jury> {
    @Mapping(target = "id", source = "id")
    @Mapping(target = "name", source = "name")
    @Mapping(target = "image", source = "image")
    Set<JuryDTO> toDto(Set<Jury> jury);
}
