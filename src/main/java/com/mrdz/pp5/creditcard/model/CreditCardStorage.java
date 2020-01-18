package com.mrdz.pp5.creditcard.model;

public interface CreditCardStorage {
    void add(CreditCard creditCard);

    CreditCard load(String number);
}
