package br.bank.com.model;

public class CustomerCreator {

    /**
     * It creates a customer based on the credit type
     *
     * @param creditType: Personal or Business
     * @return customer
     */
    public static Customer create(CreditType creditType) {
        return creditType.equals(CreditType.Person) ?
                new PersonalCustomer(creditType) : new BusinessCustomer(creditType);
    }
}
