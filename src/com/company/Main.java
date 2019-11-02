package com.company;

public class Main {


    public static String globalVar = "Переменная видна всем";

    public static double test(int num1) {
        System.out.println("Отработал метод тест" + "   " + num1);
        if (num1 > 0) {
            num1 = num1 - 1;
            test(num1);}
        return num1;
    }

    public static double myltiply(double a, double b){
        double result = a * b;
        return result;

    }



    public static void main(String[] args) {
        test(3);

        printText();
        printText();
        printText();
        printText();

        addition(5, 1.2);
        addition(4, 1.1);
        addition(32, 0.1);
        System.out.println("Переменная видна всем");

        double res = myltiply(4.6, 0.5);
        System.out.println(res);

        System.out.println(myltiply(8.0, 2.0));
    }

    public static void printText() {
        float someNumber = 6.7f;
        System.out.println("Java");
        System.out.println("Hello");
        System.out.println("GeekTech");
        System.out.println("someNumber");
        if (1 > 0) {
            int a = 9;
            System.out.println(a);
        }
    }

    public static void addition(int num1, double num2) {
        System.out.println("Переменная видна всем");
        System.out.println("Результат сложения = " + "" + (num1 + num2));


    }
}
