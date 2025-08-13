package Suyshsirsir25qtask;

public class compalindromeno 
 {
	    public static void main(String[] args) {
	        System.out.println("Palindrome numbers between 1 and 1000:");
	        for (int i = 1; i <= 1000; i++) {
	            if (isPalindrome(i)) {
	                System.out.print(i + " ");
	            }
	        }
	    }

	    public static boolean isPalindrome(int num) {
	        int reversed = 0;
	        int original = num;
	        while (num != 0) {
	            int remainder = num % 10;
	            reversed = reversed * 10 + remainder;
	            num /= 10;
	        }
	        return original == reversed;
	    }
	

}


