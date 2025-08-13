package Suyshsirsir25qtask;

import java.util.Scanner;

public class Oddnoforloop 
{
	public static void main(String args[])
	{
		System.out.println("enter the no ");
		Scanner sc=new Scanner(System.in);
		   int input =sc.nextInt();
		for(int i=1;i<=50;i++)
		{
			if(input%2!=0)
			{
				System.out.println("odd no ");
				
			}
			else 
			{
			System.out.println("odd no not");
			
		}
		}
		
	}

}
