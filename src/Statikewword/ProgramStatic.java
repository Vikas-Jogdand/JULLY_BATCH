package Statikewword;

package Statikewword;

public class ProgramStatic
{
	public static void main(String args[])
	{
		demo a2=new demo();
		a2.main();
	}
}


  
 class demo
{
	static {
		System.out.println("static block");
		
	}
	public static void main()
	{
		System.out.println("static method");
		
	}
}


