package com.stringsss;

public class SubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="flm";
String b="programming";
System.out.println(b.substring(0,3));
//ending index we have to give one more.means we have to give n+1 beacuse if we give n it takes up to n-1 so.
System.out.println(s.substring(1,2));	
System.out.println(b.substring(7,11));
//only starting also we can give index it will prints up to end 
System.out.println(b.substring(7));

	}

}
