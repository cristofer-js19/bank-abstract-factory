package br.bank.com.model;

import java.util.Random;

/**
 * Class Account (Abstract Product)
 */
public abstract class Account {

    private CreditType creditType;
    private Integer accountNumber;

    public Account(CreditType creditType) {
        this.creditType = creditType;
        this.accountNumber = new Random().nextInt(Integer.MAX_VALUE);
    }

    public CreditType getCustomerType() {
        return creditType;
    }

    public Integer getAccountNumber() {
        return accountNumber;
    }
}
