package com.example.bank_project.BankAccountApp;

import com.example.bank_project.personApp.PersonEntity;
import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
@Table(name = "bank_account")
public class BankAccountEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    @JoinColumn(name = "person_id")
    private PersonEntity person;
    @Column(name = "accountNumber")
    private String accountNumber;
    @Column(name = "balance")
    private BigDecimal balance;
}
