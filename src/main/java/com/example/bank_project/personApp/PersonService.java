package com.example.bank_project.personApp;

import com.example.bank_project.personApp.dto.PersonRs;
import com.example.bank_project.personApp.mapper.PersonMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PersonService {

    private final PersonRepository personRepository;
    private final PersonMapper personMapper;

    public PersonService(PersonRepository personRepository, PersonMapper personMapper) {
        this.personRepository = personRepository;
        this.personMapper = personMapper;
    }

    public List<PersonRs> getPersons(){
        return personRepository.findAll()
                .stream()
                .map(personMapper::toDto)
                .collect(Collectors.toList());
    }

}
