package br.bank.com.factory;

import br.bank.com.model.*;

public class BankPersonalSolutionFactory extends BankFactory {

    /**
     * It creates an account of Personal type
     *
     * @return account
     */
    @Override
    public Account createAccount() {
        return AccountCreator.create(CreditType.Person);
    }

    /**
     * It creates a customer of Personal type
     *
     * @return customer
     */
    @Override
    public Customer createCustomer() {
        return CustomerCreator.create(CreditType.Person);
    }
}
