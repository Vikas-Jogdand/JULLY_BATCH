package conditiontask;

import java.util.Scanner;

public class classfiyer 
{

	public static void main(String[] args) 
	{
		System.out.println("enter your char");
		

		Scanner h2 = new Scanner(System.in);
		char ch=h2.next().charAt(0);
		if(ch>='A' && ch<='Z')
		{
			System.out.println("your char is uppercase");
		}
		
			
			else if(ch>='a'&& ch<='z')
			{
				System.out.println("loower case letter");
				
		     }

		else if(ch>='0' && ch<='9')
		{
			System.out.println("your no digits");

		}
		else
		{
			System.out.println("your specal caharter");
		}

	}

}
