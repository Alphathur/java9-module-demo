package com.provider;

import com.calculate.Calculator;

import java.math.BigDecimal;

public class Sum implements Calculator {

    @Override
    public String getName() {
        return "Sum";
    }

    @Override
    public BigDecimal calculate(BigDecimal v1, BigDecimal v2) {
        return v1.add ( v2 );
    }
}
