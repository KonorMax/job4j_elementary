package ru.job4j.calculator;

public class CalculateMethod {

    public static void plus(int first, int second) {
        int result = first + second;
        System.out.println(result);
    }

    public static void main(String[] args) {
        CalculateMethod.plus(100, 500);
        CalculateMethod.plus(4, 2);
        CalculateMethod.plus(3, 5);
    }
}
