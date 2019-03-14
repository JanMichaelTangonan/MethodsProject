package com.LickingHeights;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        //Method 1:Hello World!
        firstMethod("World!");

        //Method 2:Introductions
        introduction();
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

    }