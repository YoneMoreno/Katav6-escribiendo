/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package moneycalculator2.model;

/**
 *
 * @author usuario
 */
public class Money {
    private final double amount;
    private Currency currency;

    public Money(double amount, Currency currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public double getAmount() {
        return amount;
    }

    public Currency getCurrency() {
        return currency;
    }
    
    
}
