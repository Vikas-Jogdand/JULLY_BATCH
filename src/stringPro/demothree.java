package stringPro;

public class demothree {

	public static void main(String[] args) 
	{
		String s="irise";
		System.out.println(System.identityHashCode(s));
		
		s=s.toUpperCase();
		System.out.println(System.identityHashCode(s));
		
		
		s=s.toLowerCase();
		System.out.println(System.identityHashCode(s));
		
		System.out.println(s);
		
		
		
		
	
	}

}
