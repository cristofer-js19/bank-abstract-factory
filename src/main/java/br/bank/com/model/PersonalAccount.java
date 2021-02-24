package br.bank.com.model;

/**
 * Class PersonalAccount (ConcreteProduct)
 */
public class PersonalAccount extends Account {

    public PersonalAccount(CreditType creditType) {
        super(creditType);
    }
}
