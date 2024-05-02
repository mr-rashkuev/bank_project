package com.example.bank_project.personApp.mapper;

import com.example.bank_project.personApp.PersonEntity;
import com.example.bank_project.personApp.dto.PersonRs;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface PersonMapper {



    PersonRs toDto(PersonEntity personEntity);

    PersonEntity toEntity(PersonRs personRs);

}
