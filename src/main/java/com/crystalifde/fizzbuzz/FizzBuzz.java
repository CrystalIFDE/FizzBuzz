package com.crystalifde.fizzbuzz;

public class FizzBuzz {

    public static void main(String[] args) {
        for (int i = 1; i < 101; i++) {
            System.out.println("My index is " + i + " and my catchphrase is " + of(i));
        }
    }

    public static String of(int index) {
        StringBuilder stringBuilder = new StringBuilder();
        if (index % 3 == 0) {
            stringBuilder.append("Fizz");
        }
        if (index % 5 == 0) {
            stringBuilder.append("Buzz");
        }
        if (index % 7 == 0) {
            stringBuilder.append("Whizz");
        }
        return stringBuilder.length() == 0 ? String.valueOf(index) : stringBuilder.toString();
    }

}
