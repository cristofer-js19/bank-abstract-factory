package br.bank.com.model;

public class AccountCreator {

    /**
     * It creates an account based on the credit type.
     *
     * @param creditType: Personal or Business
     * @return account
     */
    public static Account create(CreditType creditType) {
        return creditType.equals(CreditType.Person) ?
                new PersonalAccount(creditType) : new BusinessAccount(creditType);
    }
}
