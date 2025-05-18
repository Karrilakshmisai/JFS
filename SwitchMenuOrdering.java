package com.tasks;

import java.util.Scanner;

public class SwitchMenuOrdering {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("----Menu-----");
        System.out.println("1.Chicken 65");
        System.out.println("2:paneer");
        System.out.println("3.Biryani");
        System.out.println("Which one do you want to order:");    
        int menu = sc.nextInt();
        switch (menu) {
            case 1:
                System.out.println("Chicken 65 Order is placed");
                break;
            case 2:
                System.out.println("Panner Order is placed");
                break;
            case 3:
                System.out.println("Biryani Order is placed");
                break;
            default:
                // No explicit "Invalid choice" output in bytecode, so silent on other input.
                break;
        }
        sc.close();
    }
}
