package fristday;

import java.util.Scanner;


public class Caluleter {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the value of a:");
		int a=sc.nextInt();
		System.out.println("value of a " +a);
		
		System.out.println("===============");
		
		System.out.println("enter the value of b:");
		int b=sc.nextInt();
		System.out.println("value of b "+b);
		Caluleter c=new Caluleter();
		c.printSum(a,b);

	
	}
	public void printSum(int a,int b)
	{
		int sum=a+b;
		System.out.println("addition:"+sum);
		
	}
}



	
	


	
	
	
	

