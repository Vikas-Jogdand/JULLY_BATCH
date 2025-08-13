package conditiontask;

import java.util.Scanner;

public class tranglevilidity 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		 
		  System.out.println("enter frist angle/n");
		  int a=sc.nextInt();
		  
		  System.out.println("enter the second angle/n");
		  int b=sc.nextInt();
		  
		  System.out.println("enter the thard angle");
		   int c=sc.nextInt();
		   
		   
		  if((a+b>c) &&(a+c>b) &&(b+c>a))
		  {
			  System.out.println("trangle is valid");
			  
		  }
		  else
		  {
			  System.out.println("treangle is not valid");
			  
		  }
		   
			  
		  }
	}


