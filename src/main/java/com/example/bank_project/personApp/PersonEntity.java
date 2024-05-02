package com.example.bank_project.personApp;


import lombok.*;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
@Table(name = "person")
public class PersonEntity {
    @Id
    @Column(name = "id", unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "middle_name")
    private String middleName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "phone_number", unique = true, nullable = false)
    private String phoneNumber;
    @Column(name = "city")
    private String city;
//    @OneToOne(mappedBy = "person")
//    private BankAccountEntity bankAccount;

}
