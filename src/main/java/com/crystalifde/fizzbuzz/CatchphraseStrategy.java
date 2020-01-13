package com.crystalifde.fizzbuzz;

import jdk.internal.jline.internal.Nullable;

public interface CatchphraseStrategy {
    @Nullable
    String getCatchphraseByIndex(int index);
}
