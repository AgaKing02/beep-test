package kz.beeline.beeplay.beeplay.entity.dto.mapper;


import kz.beeline.beeplay.beeplay.entity.Stream;
import kz.beeline.beeplay.beeplay.entity.dto.StreamDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

/**
 * Mapper for the entity {@link Stream} and its DTO {@link StreamDTO}.
 */
@Mapper(componentModel = "spring", uses = { StreamCategoryMapper.class })
public interface StreamMapper extends EntityMapper<StreamDTO, Stream> {
    @Mapping(target = "category", source = "category")
    StreamDTO toDto(Stream s);
}

