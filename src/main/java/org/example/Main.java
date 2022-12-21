package org.example;

import java.util.Scanner;

import static java.util.Calendar.FRIDAY;

public class Main {

    private static void foo(Object o){
        switch (o){
            case Integer i -> System.out.println("String i");
            case  String s -> System.out.println("This is a string ");
            default -> System.out.println("object");

        }
    }

    public static void main(String[] args) {
foo("hello");
foo(4);
foo(1.4);

    }
}