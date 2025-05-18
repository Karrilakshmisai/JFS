package com.tasks;

import java.util.Scanner;

public class TaxCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
  System.out.println("Enter your salary:");
  double salary=sc.nextDouble();
  sc.close();
  if(salary < 250000)
  {
	  System.out.println("No Tax For You");
  }
  else if(salary>=250000 && salary<500000)
  {
	  Double tax=(5*salary)/100;
	  System.out.println("tax");
  }
  else if(salary>=250000 && salary<500000)
  {
	  Double tax=(5*salary)/100;
	  System.out.println("tax");
  }
  else if(salary>=250000 && salary<500000)
  {
	  Double tax=(5*salary)/100;
	  System.out.println("tax");
  }
	}
		
	}


