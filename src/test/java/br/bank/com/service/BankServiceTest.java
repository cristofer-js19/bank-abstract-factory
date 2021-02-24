package br.bank.com.service;

import br.bank.com.model.CreditType;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit test for bank-abstract-factory project.
 */
public class BankServiceTest
{
    /**
     * It validates if a Personal bank solution is correctly created.
     */
    @Test
    public void shouldCreatePersonalBankSolution() {
        BankService service = BankService.createBankSolution(CreditType.Person);
        assertEquals(service.getCustomer().getCustomerType(), CreditType.Person);
        assertEquals(service.getAccount().getCustomerType(), CreditType.Person);
        assertNotNull(service.getAccount().getAccountNumber());
    }

    /**
     * It validates if a Business bank solutions is correctly created.
     */
    @Test
    public void shouldCreateBusinessBankSolution() {
        BankService service = BankService.createBankSolution(CreditType.Company);
        assertEquals(service.getCustomer().getCustomerType(), CreditType.Company);
        assertEquals(service.getAccount().getCustomerType(), CreditType.Company);
        assertNotNull(service.getAccount().getAccountNumber());
    }
}
