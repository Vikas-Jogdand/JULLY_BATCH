package Suyshsirsir25qtask;

public class Givensumof
{
	public static void main(String args[])
	{
		 int num = 1023;
	        int sum = 0;
	        String strNum = Integer.toString(num);
	        for (int i = 0; i < strNum.length(); i++) 
	        {
	            sum += Character.getNumericValue(strNum.charAt(i));
	        }
	        {
	   
	        
	        System.out.println("Sum of digits: "+sum);

	        }
	}
}
	


