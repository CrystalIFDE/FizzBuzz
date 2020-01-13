package com.crystalifde.fizzbuzz.contain;

import com.crystalifde.fizzbuzz.FizzBuzzAlgorithm;

class ContainOfSeven implements ContainStrategy {
    @Override
    public int priority() {
        return 7;
    }

    @Override
    public boolean accept(int input) {
        return String.valueOf(input).contains("7");
    }

    @Override
    public String catchphrase() {
        return assertNotNullAndReturn(FizzBuzzAlgorithm.getCatchphraseByDivisible(7, FizzBuzzAlgorithm.quickFilter(5)));
    }
}
