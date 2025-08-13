package conditiontask;

import java.util.Scanner;

public class gretterrno {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter the first no");
		int a = sc.nextInt();

		System.out.println("enter the thard no");

		int b= sc.nextInt();

		System.out.println("enter the second no");

		int c = sc.nextInt();

		if (a >= b && a >= c) {
			System.out.println("a is gretter no" +a);

		} else if (b>=a && a>=c) {
			System.out.println("b is gretter no"+b);

		} else {
			System.out.println("c is gretter no"   +c);

		}

	}

}
