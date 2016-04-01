package week1.ex1;

class FactorialCalculator {
	private int i;
	private static int sum;
	public FactorialCalculator(int n) { 
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

	public static int getSum() {
		return sum;
	}
}
