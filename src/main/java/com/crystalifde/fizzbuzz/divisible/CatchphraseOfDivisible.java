package com.crystalifde.fizzbuzz.divisible;

import com.crystalifde.fizzbuzz.CatchphraseStrategy;
import com.crystalifde.fizzbuzz.FizzBuzzAlgorithm;

public class CatchphraseOfDivisible implements CatchphraseStrategy {

    @Override
    public String getCatchphraseByIndex(int index) {
        return FizzBuzzAlgorithm.getCatchphraseByDivisible(index);
    }
}
