package com.example.bank_project.BankAccountApp;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

@RestController
@AllArgsConstructor
@RequestMapping("/accounts")
public class BankAccountController {

    private final BankAccountService bankAccountService;

    @PostMapping
    public void makeTransaction(@RequestBody PaymentData paymentData) {
        bankAccountService.makeTransaction(paymentData);
    }
}
