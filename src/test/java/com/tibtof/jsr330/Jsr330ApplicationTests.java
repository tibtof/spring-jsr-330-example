package com.tibtof.jsr330;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.inject.Inject;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Jsr330ApplicationTests {

    @Inject
    private List<Validation> allValidations;

    @Inject
    private List<Validation<String>> stringValidations;

    @Inject
    private List<Validation<List>> listValidations;

    @Test
    public void contextLoads() {
    }

    @Test
    public void allValidationsAreInjected() {
        Assert.assertEquals(2, allValidations.size());
    }

    @Test
    public void onlyStringValidationsAreInjected() {
        Assert.assertEquals(1, stringValidations.size());
        Assert.assertTrue(stringValidations.get(0) instanceof StringNotEmpty);
    }

    @Test
    public void onlyListValidationsAreInjected() {
        Assert.assertEquals(1, listValidations.size());
        Assert.assertTrue(listValidations.get(0) instanceof ListNotEmpty);
    }

}
