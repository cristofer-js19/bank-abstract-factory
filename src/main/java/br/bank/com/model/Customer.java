package br.bank.com.model;

/**
 * Class Customer (Abstract Product)
 */
public abstract class Customer {

    private CreditType creditType;

    public Customer(CreditType creditType) {
        this.creditType = creditType;
    }

    public CreditType getCustomerType() {
        return creditType;
    }
}
