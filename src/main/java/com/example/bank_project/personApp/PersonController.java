package com.example.bank_project.personApp;

import com.example.bank_project.personApp.dto.PersonRs;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/persons")
public class PersonController {

    private final PersonService personService;

    @GetMapping("/")
    public List<PersonRs> getPersons(){
       return personService.getPersons();
    }
}
