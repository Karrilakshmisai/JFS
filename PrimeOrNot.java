package com.tasks;

public class PrimeOrNot {
   

    public static void main(String[] args) {
        int n = 3;
        int count = 0;

        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if (count == 1) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }
    }
}