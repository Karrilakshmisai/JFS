package com.tasks;

import java.util.Scanner;

	public class TernaryOperator {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter marks:");
	        int a = sc.nextInt();

	        String grade = (a > 90 && a <= 100) ? "GRADE A" :
	                       (a > 70 && a <= 90)  ? "GRADE B" :
	                       (a > 50 && a <= 70)  ? "GRADE C" :
	                       (a > 0 && a <= 50)   ? "FAIL"     :
	                                             "INVALID";

	        System.out.println(grade);
	        sc.close();
	    }
	}