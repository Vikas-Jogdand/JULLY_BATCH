package stringPro;

public class Exzaple
{
	public static void main(String args[])
	{
		
		
     //string is unmuteble		
		String s="irise";
		String s1="irise";
	
		

		System.out.println(System.identityHashCode(s));
		System.out.println(System.identityHashCode(s1));
		
		
		
		s=s.toUpperCase();
		s1=s.toUpperCase();
		
		System.out.println(System.identityHashCode(s));
		System.out.println(System.identityHashCode(s1));
		
		System.out.println(s==s1);
	}


}
