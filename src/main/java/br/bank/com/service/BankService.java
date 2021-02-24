package br.bank.com.service;

import br.bank.com.factory.BankBusinessSolutionFactory;
import br.bank.com.factory.BankFactory;
import br.bank.com.factory.BankPersonalSolutionFactory;
import br.bank.com.model.*;

/**
 * class BankService
 * It manages the creation of Bank entities (composed of Account and Customer)
 */
public class BankService {

    private Account account;
    private Customer customer;

    private BankService(BankFactory bankFactory) {
        this.account = bankFactory.createAccount();
        this.customer = bankFactory.createCustomer();
    }

    public Account getAccount() {
        return account;
    }

    public Customer getCustomer() {
        return customer;
    }

    /**
     * Provides a new entity result (composed of Account and Customer), depending on the credit type informed.
     *
     * @param creditType: Personal or Business
     * @return Bank entity
     */
    public static BankService createBankSolution(CreditType creditType) {
        return creditType.equals(CreditType.Person) ?
                new BankService(new BankPersonalSolutionFactory()) :
                new BankService(new BankBusinessSolutionFactory());
    }
}
