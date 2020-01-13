package com.crystalifde.fizzbuzz;

import com.crystalifde.fizzbuzz.contain.Contain;
import com.crystalifde.fizzbuzz.divisible.Divisible;

public class FizzBuzz {

    public static void main(String[] args) {
        for (int i = 1; i < 101; i++) {
            System.out.println("My index is " + i + " and my catchphrase is " + of(i));
        }
    }

    public static String of(int index) {
        String catchphrase = Contain.getCatchphraseByIndex(index);
        if (catchphrase != null) {
            return catchphrase;
        }
        catchphrase = Divisible.getCatchphraseByIndex(index);
        if (catchphrase != null){
            return catchphrase;
        }
        return String.valueOf(index);
    }

}
