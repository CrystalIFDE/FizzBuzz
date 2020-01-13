package com.crystalifde.fizzbuzz.contain;

import com.crystalifde.fizzbuzz.FizzBuzzAlgorithm;

class ContainOfSeven implements ContainStrategy {

    @Override
    public boolean accept(int index) {
        return String.valueOf(index).contains("7");
    }

    @Override
    public String catchphrase(int index) {
        return assertNotNullAndReturn(FizzBuzzAlgorithm.getCatchphraseByDivisible(index, FizzBuzzAlgorithm.quickFilter(5)));
    }
}
