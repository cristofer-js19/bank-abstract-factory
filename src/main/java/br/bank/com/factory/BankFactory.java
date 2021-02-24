package br.bank.com.factory;

import br.bank.com.model.Account;
import br.bank.com.model.Customer;

/**
 * Class BankFactory (Abstract Factory)
 */
public abstract class BankFactory {

    public abstract Account createAccount();
    public abstract Customer createCustomer();
}
