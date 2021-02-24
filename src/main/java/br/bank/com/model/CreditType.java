package br.bank.com.model;

/**
 * Enum CreditType
 *
 * Company: Business type
 * Person: Personal type
 */
public enum CreditType {

    Company("Business"),
    Person("Personal");

    private String description;

    CreditType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
