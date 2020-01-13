package com.crystalifde.fizzbuzz.contain;

import com.crystalifde.fizzbuzz.FizzBuzzAlgorithm;

class ContainOfThree implements ContainStrategy {

    @Override
    public boolean accept(int index) {
        return String.valueOf(index).contains("3");
    }

    @Override
    public String catchphrase(int index) {
        return assertNotNullAndReturn(FizzBuzzAlgorithm.queryCatchphraseContentByIndexInEnum(3));
    }
}
