package com.crystalifde.fizzbuzz;

import jdk.internal.jline.internal.Nullable;

public class FizzBuzzAlgorithm {

    public interface Filter<T> {
        boolean shouldFilter(T t);
    }

    @Nullable
    public static String getCatchphraseByDivisible(int number) {
        return getCatchphraseByDivisible(number, null);
    }

    @Nullable
    public static String getCatchphraseByDivisible(int number, Filter<Integer> filter) {
        StringBuilder stringBuilder = new StringBuilder();
        for (catchphrase catchphraseValue : catchphrase.values()) {
            if (filter != null && filter.shouldFilter(catchphraseValue.index)) {
                continue;
            }
            if (isMultipleOf(number, catchphraseValue.index)) {
                stringBuilder.append(catchphraseValue.content);
            }
        }
        return stringBuilder.length() == 0 ? null : stringBuilder.toString();
    }

    public static Filter<Integer> quickFilter(int target) {
        return filterNumber -> filterNumber == target;
    }

    @Nullable
    public static String getCatchphraseContentByIndex(int index) {
        for (catchphrase catchphraseValue : catchphrase.values()) {
            if (catchphraseValue.index == index) {
                return catchphraseValue.content;
            }
        }
        return null;
    }

    private static boolean isMultipleOf(int number, int target) {
        return number % target == 0;
    }

    private enum catchphrase {
        Fizz(3, "Fizz"),
        Buzz(5, "Buzz"),
        Whizz(7, "Whizz");

        private int index;
        private String content;

        catchphrase(int index, String content) {
            this.index = index;
            this.content = content;
        }
    }

}
