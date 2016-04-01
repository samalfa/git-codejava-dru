class Factorial {
	private int i;
	private int sum;
	public Factorial(int n) { 
		sum = n;
		System.out.print(n+"! = "+n);
		for (i=1; i<n; i++) {
			if (i < n-1) {
				System.out.print(""+"x"+(n-(i)));
			} else {
				System.out.print("x"+"1");
			}
			sum = sum*(n-i);
		}
		System.out.println(" = "+sum);
	}
}

public class SumFactorialV1_1 {
	public static void main(String[] args) {
		int i;
		int n = 5; 
		for (i=1; i<=n; i++) {
			new Factorial(i);
		}
	}
}
