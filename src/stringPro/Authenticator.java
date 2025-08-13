package stringPro;

import java.util.Scanner;

public class Authenticator 
{
	public static void main(String args[])
	{
		String u="vicky patil";
		String p="1234";
		
		
		
		
	Scanner sc=new Scanner(System.in);
	System.out.println ("enter the username");
	    String username=sc.next();

	    
	    
	    System.out.println("enter the pass");
	     int pass=sc.nextInt();
      
	     if(u.equals(username)&& p.equals(pass))
	     {
	    	 System.out.println("login succesfull");
	     }     
	    	 
	    	 
	    		 
	    		
	    		
	    	 
	      
	     
	    	 else
	    	 {
	    		 System.out.println("login faild");
	    		 if(u.equals(username)&&p.equals(pass))
	    		 {
	    		 System.out.println("your user name  and pass is rong");
	    		 
	    	 }
	    	 }
	    	 
	    	 
	     
	
}
}


	     
	     
	     
	     
	   



