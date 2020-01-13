package com.crystalifde.fizzbuzz.contain;

interface ContainStrategy {

    int priority();

    boolean accept(int input);

    String catchphrase();

    default String assertNotNullAndReturn(String input) {
        assert input != null;
        return input;
    }

}
