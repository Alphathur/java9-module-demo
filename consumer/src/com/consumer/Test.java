package com.consumer;

import com.calculate.Calculator;
import com.provider.Minus;
import com.provider.Sum;

public class Test {
    public static void main(String[] args) {
        Calculator sum  = new Sum ();
        System.out.println (sum.getName ());

        Calculator minus  = new Minus ();
        System.out.println (minus.getName ());

        // you can not use Div unless you exports package 'com.provider.other' in module-info.java under provider module
        // a parent package export takes no effects on subpackage
//        Calculator div = new Div ();
//        System.out.println (div.getName ());
    }
}
