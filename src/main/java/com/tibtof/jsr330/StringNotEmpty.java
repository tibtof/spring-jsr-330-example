package com.tibtof.jsr330;

import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;

@Service
public class StringNotEmpty implements Validation<String> {
    @Override
    public Boolean apply(@NotNull String s) {
        return !s.isEmpty();
    }
}
