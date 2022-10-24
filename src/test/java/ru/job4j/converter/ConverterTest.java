package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;

public final class ConverterTest {

    @Test
    public void whenConvert140RblThen2Euro() {
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void whenConvert180RblThen3Dollar() {
        float input = 180;
        float wait = 2.5714f;
        float exit = Converter.rubleToEuro(input);
        float eps = 0.0001f;
        Assert.assertEquals(wait, exit, eps);
    }
}