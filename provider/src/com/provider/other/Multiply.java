package com.provider.other;

import com.calculate.Calculator;

import java.math.BigDecimal;

public class Multiply implements Calculator {
    @Override
    public String getName() {
        return "Mutiply";
    }

    @Override
    public BigDecimal calculate(BigDecimal v1, BigDecimal v2) {
        return v1.multiply ( v2 );
    }
}
