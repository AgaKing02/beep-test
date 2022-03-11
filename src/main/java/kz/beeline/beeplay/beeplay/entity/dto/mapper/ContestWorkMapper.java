package kz.beeline.beeplay.beeplay.entity.dto.mapper;


import kz.beeline.beeplay.beeplay.entity.ContestWork;
import kz.beeline.beeplay.beeplay.entity.dto.ContestWorkDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = {ContestMapper.class})
public interface ContestWorkMapper extends EntityMapper<ContestWorkDTO, ContestWork>{
    @Mapping(target = "id", source = "id")
    @Mapping(target = "contest_id", source = "contest_id.id")
    @Mapping(target = "user_id", source = "user.id")
    @Mapping(target = "image", source = "image")
    @Mapping(target = "likes",source = "likes")
    ContestWorkDTO toDto(ContestWork contestWork);
}
