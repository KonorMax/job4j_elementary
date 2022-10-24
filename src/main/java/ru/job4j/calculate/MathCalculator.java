package ru.job4j.calculate;

import ru.job4j.math.MathFunction;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return MathFunction.sum(first, second) + MathFunction.multiply(first, second);
    }

    public static double divisionAndSum(double firs, double second) {
        return MathFunction.division(firs, second) + MathFunction.sum(firs, second);
    }

    public static double multiplyAndSubtraction(double first, double second) {
        return MathFunction.multiply(first, second) + MathFunction.subtraction(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(15, 25));
        System.out.println("Результат расчета равен: " + divisionAndSum(50, 20));
        System.out.println("Результат расчета равен: " + multiplyAndSubtraction(25, 35));
    }
}
