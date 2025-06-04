package com.stringsss;

import java.util.Scanner;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//trim only reomve starting and last spaces but not b/w
		String h="sdfg   hii";
		System.out.println(h.trim());
		String s4="   Hii  ";
		 System.out.println(s4.length());
		 System.out.println(s4.trim());
		 System.out.println(s4.length());//so here we see even it was trim before value dosent change because it was only give when it was assign to var and print it. 
	     System.out.println(s4.trim().length());///so temporary change
		System.out.println(s4.length()); 
		s4=s4.trim();
		System.out.println(s4.length());
		
		
	String s="flm edutech";
	String s1="flm";
	System.out.println(s.replace("flm","hyderabad"));
	System.out.println(s.contains(s1));
	System.out.println(s.contains("tech"));
	System.out.println(s.contains("TECH"));
	System.out.println(s.startsWith("flm"));	
	System.out.println(s.endsWith("tech"));
	String u="aassaadd";
	System.out.println(u.replaceFirst("aa", "uu"));
	System.out.println(u.replaceAll("aa", "nn"));
	System.out.println(u.toUpperCase());
	System.out.println(s4.toUpperCase());
	System.out.println();
		
//charAt says in which index that character is located.but indexOf("l") says index of character.
String d="saiaa";
System.out.println(d.indexOf('a'));
System.out.println(d.lastIndexOf('y'));//if  that dosen't have -1 will be return
 StringMethods obj=new StringMethods();
 obj.Findlength("      ");
StringMethods.printCharAtIndex();
obj.CharAt("fLm",1);
 Scanner sc=new Scanner(System.in);
 String input=sc.nextLine();
 int a=sc.nextInt();
 obj.CharAt(input,a);
 obj.CheckEmpty("");
 obj.checkblank("   a");
 obj.Findlength("   a");
 obj.equalsignore();
 
 
	}
	void Findlength(String s) {
		System.out.println(s.length());
	}
	static void printCharAtIndex() {
		String s="flm";
		System.out.println(s.charAt(0));
	}
	void CharAt(String s,int index) {
		System.out.println(s.charAt(index));
	}
	void CheckEmpty(String s) {
		System.out.println(s.isEmpty());
	}
	void checkblank(String s) {
		System.out.println(s.isBlank());
	}
	void equalsignore() {
		String s="sai";
		String s1="SAI";
		System.out.println(s.equalsIgnoreCase(s1));
	}
	

}
