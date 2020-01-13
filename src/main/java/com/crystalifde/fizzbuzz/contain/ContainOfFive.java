package com.crystalifde.fizzbuzz.contain;

import com.crystalifde.fizzbuzz.FizzBuzzAlgorithm;

class ContainOfFive implements ContainStrategy {
    @Override
    public int priority() {
        return 5;
    }

    @Override
    public boolean accept(int input) {
        return String.valueOf(input).contains("5");
    }

    @Override
    public String catchphrase() {
        return assertNotNullAndReturn(FizzBuzzAlgorithm.getCatchphraseByDivisible(5, FizzBuzzAlgorithm.quickFilter(3)));
    }
}
