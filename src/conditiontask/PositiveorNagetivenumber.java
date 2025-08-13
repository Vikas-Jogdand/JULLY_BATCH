package conditiontask;

import java.util.Scanner;

public class PositiveorNagetivenumber 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number :");
		   int number=sc.nextInt();	
		   
		   
		   
	
		   if(number>0)
		   {
			   System.out.println("you enter no is  positive");
			   
		   }
		   else if(number<0)
		   {
			   System.out.println("your no nagetive");
			   
		   }
		   else
		   {
		      System.out.println("no is zero");
		   }
	}

}
