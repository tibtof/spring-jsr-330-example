package com.tibtof.jsr330;

import java.util.function.Function;

public interface Validation<T> extends Function<T, Boolean> {
}
