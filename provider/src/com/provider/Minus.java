package com.provider;

import com.calculate.Calculator;

import java.math.BigDecimal;

public class Minus implements Calculator {


    @Override
    public String getName() {
        return "Minus";
    }

    @Override
    public BigDecimal calculate(BigDecimal v1, BigDecimal v2) {
        return v1.add ( v2.multiply ( new BigDecimal ( -1 ) ) );
    }
}
