package conditiontask;

import java.util.Scanner;

public class marksgradepro 
{
	public static void main(String args[])
	{
		  //int marks=100;
	
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the sub marks");
		 int marks=sc.nextInt();
		
		 
		 
		 
		 
		 if(marks>=90 && marks<=100)
		 {
			 System.out.println("a grade:");
		 }
		 
		 else if(marks>=80)
		 {
	
	System.out.println("b grade ");
			 
		 }
		 else if(marks>=70)
		 {
			 System.out.println("b grade: ");
			 
		 }
		 else
		 {
			 System.out.println(" fail");
			 
		 }
		 
		
	}

}
