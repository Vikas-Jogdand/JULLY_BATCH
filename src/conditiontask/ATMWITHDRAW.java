package conditiontask;

import java.util.Scanner;

public class ATMWITHDRAW {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter balance: ");
		int balance = sc.nextInt();
		

		System.out.print("Enter withdrawal amount: ");
		int withdraw = sc.nextInt();

		if (withdraw % 100 == 0) {
			if (withdraw <= balance) {
				System.out.println("Transaction Approved.");
				int remaining = balance - withdraw;
				System.out.println("Remaining Balance: " + remaining);
			} else {
				System.out.println("Transaction Rejected: Insufficient Balance.");
			}
		} else {
			System.out.println("Transaction Rejected: Amount must be multiple of 100.");
		}
	}
}
