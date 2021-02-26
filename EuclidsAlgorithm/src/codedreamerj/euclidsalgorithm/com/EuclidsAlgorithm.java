package codedreamerj.euclidsalgorithm.com;

public class EuclidsAlgorithm {
	
	public static int gcd(int a, int b) {
		if(b == 0) 
			return a;
		
			return gcd(b,a%b);
	}

	public static void main(String[] args) {
		
		System.out.println(gcd(35, 25));
		System.out.println(gcd(24, 48));
		
	}

}
