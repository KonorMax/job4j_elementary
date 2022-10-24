package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2 Euro. Test result: " + passed);

        float input = 180;
        float wait = 3;
        float exit = Converter.rubleToDollar(input);
        boolean past = wait == exit;
        System.out.println("180 rubles are 3 Dollar. Test result: " + past);

    }
}
