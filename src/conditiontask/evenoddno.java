package conditiontask;

import java.util.Scanner;

public class evenoddno
{
	public static void main(String args[])
	{
		Scanner h2=new Scanner(System.in);
		  System.out.println("enter the no");
		int  a=h2.nextInt();
	   if(a%2==0)
	   {
		   System.out.println("your no is even");
	   }
	   else
	   {
		   System.out.println("your no is odd");
	   }
	}

}
