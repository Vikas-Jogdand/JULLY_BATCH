package conditiontask;

import java.util.Scanner;

public class task
{
public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any day");
		String inputday=sc.next();	
		switch (inputday) 
		{
		case "monday":
		{
			System.out.println("1");
             break;
		}
		

		case "thusday":
		{
			System.out.println("2");
			break;

		}
		case "satrday": 
		{
			System.out.println("3");
			break;

		}
		case "friday": 
		{
			System.out.println("4");
			break;

		}
		}
	}
}

	


