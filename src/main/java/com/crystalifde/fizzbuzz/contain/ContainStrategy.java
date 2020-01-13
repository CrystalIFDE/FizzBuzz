package com.crystalifde.fizzbuzz.contain;

interface ContainStrategy {

    boolean accept(int input);

    String catchphrase();

    default String assertNotNullAndReturn(String input) {
        assert input != null;
        return input;
    }

}
