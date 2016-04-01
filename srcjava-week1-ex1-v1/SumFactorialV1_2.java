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

public class SumFactorialV1_2 {
	public static void main(String[] args) {
		int i;
		int n = 6; 
		int result = 0;
		for (i=1; i<=n; i++) {
			new FactorialCalculator(i);
			result = result + FactorialCalculator.getSum();	
		}
		System.out.println("");
		System.out.print("ผลบวกของ "+n+"!"+"+");
		for (i=1; i<n; i++) {
			if (i < n-1) {
				System.out.print(""+(n-(i))+"!+");
			} else {
				System.out.print("1!");
			}		
		}
		System.out.println(" = "+result);
	}
}
