package com.example.bank_project.BankAccountApp;

import com.example.bank_project.BankAccountApp.mapper.BankAccountMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
@AllArgsConstructor
public class BankAccountService {

    private final BankAccountRepository bankAccountRepository;
    private final BankAccountMapper bankAccountMapper;

    public BigDecimal getBalance(String accountNumber) {
        return bankAccountRepository.getBalance(accountNumber);
    }

    public void makeTransaction(PaymentData paymentData) {
        BankAccountEntity bankAccount = bankAccountRepository.findByAccountNumber(paymentData.getAccountNumber());
        if (bankAccount.getBalance().compareTo(paymentData.getSum()) >= 0) {
            bankAccount.setBalance(bankAccount.getBalance().subtract(paymentData.getSum()));
            bankAccountRepository.save(bankAccount);
        } else{
            throw new RuntimeException("Недостаточно средств");
    }
}

}
