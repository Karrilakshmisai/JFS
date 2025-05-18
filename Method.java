package com.methods;

import java.util.Scanner;

public class Method {//to do the repeated operation we use methods.
  static int d=6;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println(d); //it is static so it dosen't need object
		Method s=new Method();
		Scanner sc=new Scanner(System.in);//to take user input
		int c=sc.nextInt();
		int d=sc.nextInt();
	    s.sum();
	    s.Add(c,d);
		s.AddingTwonumbers(3,4);
		s.AddingTwonumbers(100, 20);
		sc.close();
	}
	void sum() {
		int a=9;
		int b=8;
	    int c=a+b;
		System.out.println(c);
	}
	void Add(int a,int f) {
		System.out.println(a+f);
	}
	//using parameters and giving values through arguments passing
		void AddingTwonumbers(int a, int b){
			int c=a+b;
			System.out.println(c);
		}
}
