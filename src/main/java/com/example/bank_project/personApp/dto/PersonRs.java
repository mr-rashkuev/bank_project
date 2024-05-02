package com.example.bank_project.personApp.dto;


import lombok.*;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class PersonRs {

    private Long id;
    private String firstName;
    private String middleName;
    private String lastName;
    private String phoneNumber;
    private String city;
}
