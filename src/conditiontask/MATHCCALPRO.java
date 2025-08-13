package conditiontask;
import java.util.Scanner;

public class MATHCCALPRO 
{


 
	    public static void main(String[] args) 
	    {
	        Scanner sc = new Scanner(System.in);

	      
	        System.out.print("Enter first number: ");
	        int num1 = sc.nextInt();

	        System.out.print("Enter second number: ");
	        int num2 = sc.nextInt();

	        
	        System.out.println("Enter your choice:");
	        System.out.println("1: Add");
	        System.out.println("2: Subtract");
	        System.out.println("3: Multiply");
	        System.out.println("4: Divide");
	        int choice = sc.nextInt();

	       
	        if (choice == 1) {
	            System.out.println("Addition = " + (num1 + num2));
	        } else {
	            if (choice == 2) {
	                System.out.println("Subtraction = " + (num1 - num2));
	            } else {
	                if (choice == 3) {
	                    System.out.println("Multiplication = " + (num1 * num2));
	                } else {
	                    if (choice == 4) {
	                        if (num2 != 0) {
	                            System.out.println("Division = " + (num1 / num2));
	                        } else {
	                            System.out.println("Cannot divide by zero.");
	                        }
	                    } else {
	                        System.out.println("Invalid choice.");
	                    }
	                }
	            }
	        }

	        
	    }
	}


