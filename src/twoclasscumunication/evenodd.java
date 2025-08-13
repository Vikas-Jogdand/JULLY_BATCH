package twoclasscumunication;

import java.util.Scanner;

public class evenodd 
{
	public static void main(String args[])
{
		System.out.println("enter the no");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
	
	
		if(num%2==0)
		{
			System.out.println(   "it is even no");
		}
		else 
		{
			System.out.println(  "it is odd no");
		}
	}

}
