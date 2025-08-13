package stringPro;

import java.util.Scanner;

		public class UserNameCreator
		{
		    public static void main(String[] args) 
		    {
		        Scanner sc = new Scanner(System.in);

		        // Input
		        System.out.print("Enter first name: ");
		        String name = sc.nextLine();         // Example: Michael

		        System.out.print("Enter last name: ");
		        String lastname = sc.nextLine();     // Example: Perlin

		        System.out.print("Enter year of birth: ");
		        int year = sc.nextInt();             // Example: 1985

		        // Logic to generate username
		        String username = lastname.charAt(0) + name.substring(0, 4) + String.valueOf(year).substring(2);

		        // Output
		        System.out.println("Generated Username: " + username);
		    }
		}
