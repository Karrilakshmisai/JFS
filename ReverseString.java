package com.stringsss;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc=new Scanner(System.in);
   String sp=sc.nextLine();
	ReverseString rev=new ReverseString();
	String res=rev.reverse(sp);
	System.out.println(res);
	//sc.close();	
	}	
	String reverse(String s) {	
		String result="";
		for (int i=s.length()-1;i>=0;i--) {
		char temp=	s.charAt(i);
		result=result+temp;	
		}
		return result;		
	}	
}
