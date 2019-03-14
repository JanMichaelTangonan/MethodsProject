package com.LickingHeights;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        //Method 1:Hello World!
        firstMethod("World!");

        //Method 2:Introductions
        introduction();

        //Method 3:Multiplication
        int a = 5;
        int b = 5;
        System.out.println(multiplication(a, b));

        //Method 4:Division
        int c = 100;
        int d = 5;
        System.out.println(division(c, d));

        /*///Method 5:Max value
        double e = 25;
        double f = 35;
        System.out.println(maxValue(e,f) + "is the maximum value");*/

        //Method 6:Order Switching
        orderSwitching();
    }

    public static void firstMethod(String place) {

        System.out.println("Hello " + place);

    }

    public static String introduction() {
        Scanner input = new Scanner(System.in);
        String givenName = input.nextLine();
        System.out.println("Hi my name is " + givenName);

        return givenName;

    }

    public static int multiplication(int firstNumber, int secondNumber) {

        return firstNumber * secondNumber;
    }

    public static double division(int firstNumber, int secondNumber) {
        double quotient;
        quotient = firstNumber / secondNumber;
        return quotient;

    }

    /*public static double maxValue(double firstNumber, double secondNumber) {
        double = 35.00;
        double = 25.00;
        return highestNumber;

    }*/

    public static String orderSwitching(){
        String firstWord;
        String secondWord;
        String switchedStatements;
        firstWord = ("Team");
        secondWord = ("Fortress");
        switchedStatements = secondWord + firstWord;

        return switchedStatements;
    }
}