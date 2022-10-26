package ru.job4j.condition;

public class Point {

    public static double distance(int x1, int y1, int x2, int y2) {
        double rsl1 = (x2 - x1);
        double rsl2 = (y2 - y1);
        double first = Math.pow(rsl1, 2);
        double second = Math.pow(rsl2, 2);
        double rsl3 = first + second;
        double rsl = Math.sqrt(rsl3);

        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 2);
        System.out.println("result (0 , 0) to (2 , 2) = "  + result);
        double result1 = Point.distance(0, 0, 2, 0);
        System.out.println("result1 (0 , 0) to (2 , 0) = "  + result1);
        double result2 = Point.distance(1, 0, 2, 2);
        System.out.println("result2 (1 , 0) to (2 , 2) = "  + result2);
        double result3 = Point.distance(2, 1, 2, 0);
        System.out.println("result3 (2 , 1) to (2 , 0) = "  + result3);
        double result4 = Point.distance(2, 1, 2, 2);
        System.out.println("result3 (2 , 1) to (2 , 0) = "  + result4);
    }
}
