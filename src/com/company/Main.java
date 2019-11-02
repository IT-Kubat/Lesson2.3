package com.company;

public class Main {


    public static String globalVar = "Переменная видна всем";


    public static void main(String[] args) {

        printText();
        printText();
        printText();
        printText();

        addition(5, 1.2);
        addition(40, 14.6);
        addition(32, 75.1);
        System.out.println("globalVar");

    }

    public static void printText() {
        float someNumber = 6.7f;
        System.out.println("Java");
        System.out.println("Hello");
        System.out.println("GeekTech");
        System.out.println("someNumber");
        if (1>0){
          int a = 9}
    }
    public static void addition(int num1, double num2){
        System.out.println("globalVar");
        System.out.println("Результат сложения = "+"" + (num1 + num2));

    }
}
