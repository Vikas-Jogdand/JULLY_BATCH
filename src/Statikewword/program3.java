package Statikewword;

class animal
{
	static int age=24;
	static {
		System.out.println("static block");
		
	}
	public animal()
	{
		System.out.println("constarter ");
		
	}
}












public class program3 
{
	public static void main(String args[])
	{
		animal a3=new animal();
		System.out.println(a3.age);
		
	}

}
