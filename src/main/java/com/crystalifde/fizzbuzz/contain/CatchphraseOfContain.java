package com.crystalifde.fizzbuzz.contain;

import com.crystalifde.fizzbuzz.CatchphraseStrategy;

public class CatchphraseOfContain implements CatchphraseStrategy {

    private static ContainStrategy[] divisibleStrategies = new ContainStrategy[]{
            new ContainOfSeven(), new ContainOfFive(), new ContainOfThree()
    };

    @Override
    public String getCatchphraseByIndex(int index) {
        for (ContainStrategy containStrategy : divisibleStrategies) {
            if (containStrategy.accept(index)) {
                return containStrategy.catchphrase(index);
            }
        }
        return null;
    }
}
