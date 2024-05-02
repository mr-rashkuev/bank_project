package com.example.bank_project.BankAccountApp.mapper;


import com.example.bank_project.BankAccountApp.BankAccountEntity;
import com.example.bank_project.BankAccountApp.dto.BankAccountRs;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface BankAccountMapper {

    @Mapping(target = "person", source = "bankAccount.person.lastName")
    BankAccountRs toDto(BankAccountEntity bankAccount);
    @Mapping(target = "person", ignore = true)
    BankAccountEntity toEntity(BankAccountRs bankAccountRs);

}
