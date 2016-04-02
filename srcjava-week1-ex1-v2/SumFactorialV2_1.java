package week1.ex1;
import helpers.HelperInput;
import week1.ex1.FactorialCalculator;

public class SumFactorialV2_1 {

	private static int number;

	public SumFactorialV2_1() {
		int i, n, result = 0;

		System.out.print("Input: 0 ออกจากโปรแกรม | หรือ Input N: ");
		n = new HelperInput().inputInt();
		number = n;
		if (n > 0) {
			for (i=1; i<=n; i++) {
				new FactorialCalculator(i);
				result = result + FactorialCalculator.getSum();	
			}
			if (n == 1) {
				System.out.print("ผลบวกของ "+n+"!");
				System.out.println(" = "+result);
				System.out.println("================================================");
				System.out.println("");
			} else {
				System.out.print("ผลบวกของ "+n+"!"+"+");
				for (i=1; i<n; i++) {
					if (i < n-1) {
						System.out.print(""+(n-(i))+"!+");
					} else {
						System.out.print("1!");
					}		
				}
				System.out.println(" = "+result);
				System.out.println("================================================");
				System.out.println("");	
			}
		}
	}

	public static int getNumber() {
		return number;
	}
}
