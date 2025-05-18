package com.breakandcontinue;

public class BreakAndContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=0;i<=10;i++)
		{
			
			if(i>=3&&i<=7) {
				
				continue;
			}
			System.out.println(i);
			
			
		}
		
		for(int j=0;j<=7;j++) {
			//System.out.println(j);
			if(j==3) {
				break;
			}
			System.out.println(j);
		}
		
	}

}
