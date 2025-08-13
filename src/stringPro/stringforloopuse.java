package stringPro;

public class stringforloopuse {

	public static void main(String[] args) 
	
	{
		  String day="monday";
		 int length=day.length();
		  for(int i=0;i<day.length();i++)
		  {
			  if(i%2==0) {
				  System.out.println(day.charAt(i));
			  }
			  char c=day.charAt(i);
			  System.out.println(day.charAt(i));
		  }

	}

}
