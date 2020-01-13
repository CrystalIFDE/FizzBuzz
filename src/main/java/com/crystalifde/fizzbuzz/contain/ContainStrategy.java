package com.crystalifde.fizzbuzz.contain;

interface ContainStrategy {

    boolean accept(int index);

    String catchphrase(int index);

    default String assertNotNullAndReturn(String input) {
        assert input != null;
        return input;
    }

}
