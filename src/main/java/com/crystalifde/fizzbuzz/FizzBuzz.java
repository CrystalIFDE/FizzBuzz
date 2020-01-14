package com.crystalifde.fizzbuzz;

public class FizzBuzz {

    public static void main(String[] args) {
        for (int i = 1; i < 101; i++) {
            System.out.println("My index is " + i + " and my catchphrase is " + of(i));
        }
    }

    public static String of(int index) {
        if (index % 3 == 0) {
            return "Fizz";
        } else if (index % 5 == 0) {
            return "Buzz";
        } else if (index % 7 == 0) {
            return "Whizz";
        }
        return String.valueOf(index);
    }

}
