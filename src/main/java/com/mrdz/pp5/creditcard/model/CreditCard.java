package com.mrdz.pp5.creditcard.model;

import java.math.BigDecimal;

public class CreditCard {
    private BigDecimal limit;

    public void assignLimit(BigDecimal initialLimit) {
        if (BigDecimal.valueOf(1000).compareTo(initialLimit) == 1) {
            throw new CreditBelowException();
        }
        limit = initialLimit;
    }

    public BigDecimal limit() {
        return limit;
    }
}
