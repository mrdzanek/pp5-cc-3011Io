package com.mrdz.pp5.creditcard.model;

import com.sun.org.apache.xpath.internal.objects.XNumber;

import java.math.BigDecimal;

public class CreditCardFacade {
    private InMemoryCreditCardStorage creditCardStorage;

    public CreditCardFacade(InMemoryCreditCardStorage creditCardStorage) {
        this.creditCardStorage = creditCardStorage;
    }

    public void withdraw(String number, BigDecimal amount) {
        CreditCard creditCard = creditCardStorage.load(number);
        creditCard.withdraw(amount);
        creditCardStorage.add(creditCard);
    }

    public CardSummary getSummary(String number) {
        CreditCard creditCard = creditCardStorage.load(number);
        return creditCard.getSummary();
    }
}
