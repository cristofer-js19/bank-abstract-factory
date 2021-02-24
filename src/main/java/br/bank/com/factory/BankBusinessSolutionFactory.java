package br.bank.com.factory;

import br.bank.com.model.*;

public class BankBusinessSolutionFactory extends BankFactory {

    /**
     * It creates an account of Business type.
     *
     * @return account
     */
    @Override
    public Account createAccount() {
        return AccountCreator.create(CreditType.Company);
    }

    /**
     * It creates a customer of Business type
     *
     * @return customer
     */
    @Override
    public Customer createCustomer() {
        return CustomerCreator.create(CreditType.Company);
    }
}
