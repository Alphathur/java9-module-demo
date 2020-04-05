package com.calculate;

import java.math.BigDecimal;

public interface Calculator {

    String getName();
    BigDecimal calculate(BigDecimal v1, BigDecimal v2);
}
