package fristday.fristday;

class b 
{
	void adii(int a, int b) 
	{
		System.out.println("adii=" + (a + b));
	}

	void multi(int a, int b, int c) 
	{
		System.out.println("multip=" + (a * b * c));
	}
}
	public class Demo {
		public static void main(String args[]) 
		{
			b t1 = new b();
			t1.adii(10, 20);
			t1.multi(10, 20, 30);
		}
	}

