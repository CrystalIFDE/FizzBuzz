package com.crystalifde.fizzbuzz.contain;

import com.crystalifde.fizzbuzz.CatchphraseStrategy;

import java.util.Arrays;
import java.util.Comparator;

public class CatchphraseOfContain implements CatchphraseStrategy {

    private static ContainStrategy[] divisibleStrategies = new ContainStrategy[]{
            new ContainOfSeven(), new ContainOfFive(), new ContainOfThree()
    };

    @Override
    public String getCatchphraseByIndex(int index) {
        Arrays.sort(divisibleStrategies, Comparator.comparingInt(ContainStrategy::priority));
        for (ContainStrategy containStrategy : divisibleStrategies) {
            if (containStrategy.accept(index)) {
                return containStrategy.catchphrase();
            }
        }
        return null;
    }
}
