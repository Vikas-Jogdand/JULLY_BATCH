package twoclasscumunication;

import java.util.Scanner;

public class studentmarks
{

public static void main(String args[])
{
	 int marks;
	System.out.println("enter marks");
	Scanner sc=new Scanner(System.in);
  int marks1=sc.nextInt();
  
  
  if(marks1>=90)
  {
	  System.out.println("a grade");
	
  }
  else if(marks1>=70)
  {
	  System.out.println("b grade");
	  
	  
  }
  else if(marks1>=35)
  {
	  System.out.println("fail");
  }
	
	
  else
  {
		System.out.println("b grade");

	  
  }
 }
}
    


	


	
	
	
	

