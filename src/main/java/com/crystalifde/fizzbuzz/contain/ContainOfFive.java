package com.crystalifde.fizzbuzz.contain;

import com.crystalifde.fizzbuzz.FizzBuzzAlgorithm;

class ContainOfFive implements ContainStrategy {

    @Override
    public boolean accept(int index) {
        return String.valueOf(index).contains("5");
    }

    @Override
    public String catchphrase(int index) {
        return assertNotNullAndReturn(FizzBuzzAlgorithm.getCatchphraseByDivisible(index, FizzBuzzAlgorithm.quickFilter(3)));
    }
}
