package kz.beeline.beeplay.beeplay.entity.dto.mapper;

import kz.beeline.beeplay.beeplay.entity.StreamCategory;
import kz.beeline.beeplay.beeplay.entity.dto.StreamCategoryDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

/**
 * Mapper for the entity {@link StreamCategory} and its DTO {@link StreamCategoryDTO}.
 */
@Mapper(componentModel = "spring", uses = {})
public interface StreamCategoryMapper extends EntityMapper<StreamCategoryDTO, StreamCategory> {
    @Mapping(target = "id", source = "id")
    @Mapping(target = "slug", source = "slug")
    @Mapping(target = "title", source = "title")
    StreamCategoryDTO toDto(StreamCategory streamType);
}
