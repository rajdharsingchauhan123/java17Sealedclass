package org.example;

import java.util.Scanner;

import static java.util.Calendar.FRIDAY;

public class Main {

    private static void foo(Object o){
        switch (o){
            case Integer i -> System.out.println("String i" +i);
            case  String s && s.length()>1 -> System.out.println("Tis" +s);
            default -> System.out.println("object");

        }
    }

    public static void main(String[] args) {
foo("s");
foo(4);
foo(1.4);
foo(bar());
foo(Integer.valueOf(11));

    }
    public  static Object bar(){
        return new Object();
    }
}