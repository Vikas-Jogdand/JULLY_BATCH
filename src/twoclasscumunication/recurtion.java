package twoclasscumunication;

public class recurtion
{
	public static void printCount(int number)
	{
		if(number>1)
		{
			System.out.println(number);
			printCount(number-1);
		}
	
		
	}


     

	public static void main(String args[])
	{
	
		
		printCount(10);
		
}
}