package org.devajayantha.test;

public class Calculator  {
    public Integer add(Integer a, Integer b) {
        return a + b;
    }

    public Integer divide(Integer a, Integer b) {
        if (b == 0) {
            throw new IllegalArgumentException("Argument 'divisor' is 0");
        }

        return a / b;
    }
}
