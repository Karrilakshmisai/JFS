package com.tasks;


import java.util.Scanner;

public class SumOfDigits {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 Scanner sc=new Scanner(System.in);
	 int n=sc.nextInt();
	 int sum=0;
	 //153
	 while(n>0) {
		 sum=sum+n%10;//3//5//1
		 n=n/10;//15
	 }
	 System.out.println(sum);
	 sc.close();
      }
	
	}
