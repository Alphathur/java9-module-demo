package com.provider.other;

import com.calculate.Calculator;

import java.math.BigDecimal;

public class Div implements Calculator {
    @Override
    public String getName() {
        return "Div";
    }

    @Override
    public BigDecimal calculate(BigDecimal v1, BigDecimal v2) {
        return v1.divide ( v2 );
    }
}
