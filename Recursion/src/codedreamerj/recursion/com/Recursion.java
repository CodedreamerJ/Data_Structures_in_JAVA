package codedreamerj.recursion.com;

import java.util.*; 

public class Recursion {
	
	public static int factorial(int n) {
		
		int result = 1;
		
		for (int i = 1; i <= n; i++) {
			result *= i;
		}
		return result;
	}
	
public static int recursion(int n) {
		
		if (n == 0)
			return 1;
	
		return n*(recursion(n-1));
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number you wish to calculate the factorial: "); 
		
		int input = sc.nextInt();
		System.out.println("The factorial of " + factorial(input));
		
		System.out.println("The factorial of " + recursion(input));

	}

}
