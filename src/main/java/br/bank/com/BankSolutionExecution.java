package br.bank.com;

import br.bank.com.model.CreditType;
import br.bank.com.service.BankService;

/**
 * Class BankSolutionExecution
 *
 * Basic main class for demonstrating the implementation
 * of Abstract Factory Design Pattern.
 */
public class BankSolutionExecution
{
    public static void main( String[] args ) {
        BankService personBankService = BankService.createBankSolution(CreditType.Person);
        System.out.println("Customer Type: " + personBankService.getCustomer().getCustomerType());
        System.out.println("Customer Type / Account: " + personBankService.getAccount().getCustomerType());
        System.out.println("Account Number: " + personBankService.getAccount().getAccountNumber());

        System.out.println();

        BankService businessBankService = BankService.createBankSolution(CreditType.Company);
        System.out.println("Customer Type: " + businessBankService.getCustomer().getCustomerType());
        System.out.println("Customer Type / Account: " + businessBankService.getAccount().getCustomerType());
        System.out.println("Account Number: " + businessBankService.getAccount().getAccountNumber());

    }
}
