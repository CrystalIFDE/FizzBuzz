package com.crystalifde.fizzbuzz;

import com.crystalifde.fizzbuzz.contain.CatchphraseOfContain;
import com.crystalifde.fizzbuzz.divisible.CatchphraseOfDivisible;

public class FizzBuzz {

    private static CatchphraseStrategy[] catchphraseStrategies =
            new CatchphraseStrategy[]{new CatchphraseOfContain(), new CatchphraseOfDivisible()};

    public static void main(String[] args) {
        for (int i = 1; i < 101; i++) {
            System.out.println("My index is " + i + " and my catchphrase is " + of(i));
        }
    }

    public static String of(int index) {
        for (CatchphraseStrategy catchphraseStrategy : catchphraseStrategies) {
            String catchphrase = catchphraseStrategy.getCatchphraseByIndex(index);
            if (catchphrase != null) {
                return catchphrase;
            }
        }
        return String.valueOf(index);
    }

}
