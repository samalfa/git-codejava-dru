import java.util.Arrays;
import java.lang.*;

public class SamCalculatorV2 {

	private static double result;

	public static String removeAllPlus(String s) {
		return s.replaceAll("+", ",");
	}

	public static void add(String str) {
		
		String s = removeAllPlus(str);
		String[] data = s.split(",");

		System.out.println(Arrays.toString(data)); //for test String data[]

		// double[] arrDouble = new double[data.length];
		// for (int i=0; i<data.length; i++) {
		// 	arrDouble[i] = Double.parseDouble(data[i]);
		// 	result += arrDouble[i];
		// }
		// return result;
	}

	public static void sub(String str) {

	}

	public static void showResult(String[] args) {
		if(args[0].equals("add")) {
			add(args[1]);
			System.out.print("ผลบวกของ: ");
		} else if(args[0].equals("sub")) {
			sub(args[1]);
			System.out.print("ผลลบของ : ");
		} else {
			System.out.println("Plese type: add or sub num1 num2 ...numN");
			System.exit(0);
		}
		System.out.print(args[1]);
		System.out.printf(" = %,.2f\n",result);
	}

	public static void drawEqualLine(String[] args) {
		int sumArgs = 0;
		for(int i=1; i<args.length; i++) {
			sumArgs += args[i].length();
		}
		for(int j=0; j <= sumArgs+(args.length-2)+18; j++) {
			System.out.print("=");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		//drawEqualLine(args);
		//showResult(args);
		add(args[1]);
		//drawEqualLine(args);
	}
}
