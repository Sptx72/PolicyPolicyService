package com.policy.policy_service.policy_service.policy.domain.model.policy;

import lombok.*;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Money {

    private BigDecimal money;
    private Denomination denomination;

    public Money(BigDecimal money, Denomination denomination) {
        this.money = money;
        this.denomination = denomination;
    }

    public Money() {
        this.money = new BigDecimal("0");
        this.denomination = Denomination.EUR;
    }

    public void setDenominationType(Denomination denomination) {
        if (this.denomination.equals(denomination))
            return;

        if (Denomination.EUR.equals(denomination)) {
            this.money = this.money.divide(new BigDecimal("100"), RoundingMode.HALF_UP);
        } else {
            this.money = this.money.multiply(new BigDecimal("100"));
        }
    }

    public void add(Money money) {
        this.money = this.money.add(money.money);
    }

    public enum Denomination {
        EUR,
        CENT
    }
}
