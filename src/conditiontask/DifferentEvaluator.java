package conditiontask;
import java.util.Scanner;

public class DifferentEvaluator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        if (num1 != num2) {
            System.out.println("The numbers are different.");
        } else {
            System.out.println("The numbers are the same.");
        }
    }
}
