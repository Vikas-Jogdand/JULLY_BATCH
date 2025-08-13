package conditiontask;

import java.util.Scanner;

public class ATMWITHDRAWAMOUNT 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the amount ");
		    int amount=sc.nextInt();
		
		System.out.println("withdraww amount");
		  int withdraww=sc.nextInt();
		 int withdraw = 0;
		 int opretion = amount-withdraw;
	
		  
		  int opreation = 0;
		  if(opreation>=withdraw)
		  {
			  System.out.println("your balance="+opreation);
			  
		  }
		  else
		  {
			  System.out.println("not sufficent balace");
		  }
		  
		  
	}

}
