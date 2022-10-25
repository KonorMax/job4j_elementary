package ru.job4j.calculater;


import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second) + multiply(first, second);
    }

    public static double divisionAndSum(double firs, double second) {
        return division(firs, second) + sum(firs, second);
    }

    public static double multiplyAndSubtraction(double first, double second) {
        return multiply(first, second) + subtraction(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(15, 25));
        System.out.println("Результат расчета равен: " + divisionAndSum(50, 20));
        System.out.println("Результат расчета равен: " + multiplyAndSubtraction(25, 35));
    }
}

