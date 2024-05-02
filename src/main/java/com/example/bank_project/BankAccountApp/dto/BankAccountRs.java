package com.example.bank_project.BankAccountApp.dto;



import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class BankAccountRs {

    private Long id;
    private String person;
    private String accountNumber;

}

