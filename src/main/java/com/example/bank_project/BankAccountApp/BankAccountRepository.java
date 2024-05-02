package com.example.bank_project.BankAccountApp;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

@Repository
public interface BankAccountRepository extends JpaRepository<BankAccountEntity, Long> {

    @Query("select balance from BankAccountEntity where accountNumber=?1")
    BigDecimal getBalance(String accountNumber);

    BankAccountEntity findByAccountNumber(String accountNumber);
}
