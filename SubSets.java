package com.stringsss;

public class SubSets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	SubSets s=new SubSets();
	s.subsets("sai");
		
	}
	
	void subsets(String s) {
		
		for(int i=0;i<=s.length()-1;i++)
		{
		for(int j=i+1;j<=s.length();j++)	
		{	
		System.out.println(s.substring(i,j));	
			
		}
						
		}
	}

	

}
