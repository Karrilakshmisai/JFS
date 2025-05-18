package com.breakandcontinue;

public class NestedBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  for(int i=1;i<=3;i++)
  {
	  for(int j=1;j<=3;j++)
	  {
		  if(j==2) {
			  break;
		  }
		  System.out.println(i+ " ,"+ j);
	  }
  }
  
  // we have labels in java to break particular loop.
  inner:
  for(int i=1;i<=3;i++)
  {
	  for(int j=1;j<=3;j++)
	  {
		  if(j==2) {
			  break inner;
		  }
		  System.out.println(i+ " ,"+ j);
	  }
  }  
	}

}
