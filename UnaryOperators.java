package com.tasks;


public class UnaryOperators {
    public static void main(String[] args) {
        short a = 6;
        short b = -9;
        boolean c = true;

        System.out.println(a);        // 6
        System.out.println(-b);       // 9 (negation)
        
        a = (short)(a + 1);
        System.out.println(a);        // 7

        a = (short)(a + 1);
        System.out.println(a);      

        b = (short)(b - 1);
        System.out.println(b);        // -10

        b = (short)(b - 1);
        System.out.println(b);        // -11

        System.out.println(!c);       // false (logical NOT)
    }
}