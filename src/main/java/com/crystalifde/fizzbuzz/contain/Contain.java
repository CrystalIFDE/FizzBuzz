package com.crystalifde.fizzbuzz.contain;

import jdk.internal.jline.internal.Nullable;

import java.util.Arrays;
import java.util.Comparator;

public class Contain {

    private static ContainStrategy[] divisibleStrategies = new ContainStrategy[]{
            new ContainOfSeven(), new ContainOfFive(), new ContainOfThree()
    };

    @Nullable
    public static String getCatchphraseByIndex(int index) {
        Arrays.sort(divisibleStrategies, Comparator.comparingInt(ContainStrategy::priority));
        for (ContainStrategy containStrategy : divisibleStrategies) {
            if (containStrategy.accept(index)) {
                return containStrategy.catchphrase();
            }
        }
        return null;
    }

}
