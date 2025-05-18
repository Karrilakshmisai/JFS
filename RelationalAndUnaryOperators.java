package com.tasks;


public class RelationalAndUnaryOperators {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        boolean equal = (a == b);
        boolean lessthan = (a < b);
        boolean lessthanorequalto = (a <= b);
        boolean greaterthan = (a > b);
        boolean greaterthanorequalto = (a >= b);
        boolean f = (a != b);

        System.out.println(equal);               // false
        System.out.println(lessthan);            // true
        System.out.println(lessthanorequalto);   // true
        System.out.println(greaterthan);         // false
        System.out.println(greaterthanorequalto);// false
        System.out.println(f);                   // true
    }
}