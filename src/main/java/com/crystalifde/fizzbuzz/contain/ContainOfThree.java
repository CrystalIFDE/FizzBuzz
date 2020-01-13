package com.crystalifde.fizzbuzz.contain;

import com.crystalifde.fizzbuzz.FizzBuzzAlgorithm;

class ContainOfThree implements ContainStrategy {
    @Override
    public int priority() {
        return 3;
    }

    @Override
    public boolean accept(int input) {
        return String.valueOf(input).contains("3");
    }

    @Override
    public String catchphrase() {
        return assertNotNullAndReturn(FizzBuzzAlgorithm.getCatchphraseContentByIndex(3));
    }
}
