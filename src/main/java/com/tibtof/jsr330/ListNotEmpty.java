package com.tibtof.jsr330;


import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;
import java.util.List;

@Service
public class ListNotEmpty implements Validation<List> {
    @Override
    public Boolean apply(@NotNull List list) {
        return !list.isEmpty();
    }
}
