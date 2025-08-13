package conditiontask;

import java.util.Scanner;

public class agecategerycheck 
{
	public static void main (String []vicky)
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the age");
;
		  int  age=sc.nextInt();
		  
		  if(age<16)
		  {
			  System.out.println("child");
			  
		  }
		  else if(age>=16&& age<20)
		  {
			  System.out.println("tenn");
			  
		  }
		  else if(age>=20&& age<60)
		  {
			  System.out.println("adult");
			  
		  }
		  else 
				 
				 
			
		  {
			  System.out.println("siniyear");
			  
		  }
			  
			  
		  
			  
		  
		  
		  
		  
		  
		  
		  
	}
	

}
