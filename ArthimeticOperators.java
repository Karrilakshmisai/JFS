package com.tasks;

public class ArthimeticOperators {


	public static void main(String[] args) {
	    int a = 10;
	    int b = 20;
	    float f = 5.0f;
	    int add = a + b;
	    System.out.println(a + " + " + b + " = " + add);

	    System.out.println(a + " - " + b + " = " + (a - b));
	    System.out.println(a + " * " + b + " = " + (a * b));
	    System.out.println(b + " / " + a + " = " + (b / a));   // int division
	    System.out.println(b + " % " + a + " = " + (b % a));   // int modulus

	    System.out.println(a + " + " + f + " = " + (a + f));
	    System.out.println(a + " - " + f + " = " + (a - f));
	    System.out.println(a + " * " + f + " = " + (a * f));
	    System.out.println(f + " / " + a + " = " + (f / a));   // float division
	    System.out.println(f + " % " + a + " = " + (f % a));   // float modulus
	}
	}

