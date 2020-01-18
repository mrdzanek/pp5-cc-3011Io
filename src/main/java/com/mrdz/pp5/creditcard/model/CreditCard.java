package com.mrdz.pp5.creditcard.model;

import java.math.BigDecimal;

public class CreditCard {
    private BigDecimal limit;
    private BigDecimal saldo;

    public void assignLimit(BigDecimal initialLimit) {
        if (BigDecimal.valueOf(1000).compareTo(initialLimit) == 1) {
            throw new CreditBelowException();
        }
        limit = initialLimit;
        saldo = initialLimit;
    }

    public BigDecimal limit() {
        return limit;
    }

    public void withdraw(BigDecimal amount) {
        this.saldo = saldo.subtract(amount);
    }

    public BigDecimal currentBalance() {
        return saldo;
    }
}
