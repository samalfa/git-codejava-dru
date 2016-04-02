package week1.ex1;
import helpers.HelperInput;
import week1.ex1.FactorialCalculator;

public class SumFactorialV2_0 {

	public static void main(String[] args) {
		int i;
		int n; 
		int result = 0;

		n = new HelperInput().inputInt();
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
