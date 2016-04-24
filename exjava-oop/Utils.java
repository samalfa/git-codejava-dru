import java.util.Scanner;

public class Utils {

	public static int inputInt() {
		Scanner input = new Scanner(System.in);
		return input.nextInt();
	}

	public static double inputDouble() {
		Scanner input = new Scanner(System.in);
		return input.nextInt();
	}

	public static String inputString() {
		Scanner input = new Scanner(System.in);
		return input.nextLine();
	}

	public static int[] stringToInt(String[] args) {
		int[] arrInt = new int[args.length];
		for (int i=1; i<args.length; i++) {
			arrInt[i] = Integer.parseInt(args[i]);
		}
		return arrInt;
	}	

	public static double[] stringToDouble(String[] args) {
		double[] arrDouble = new double[args.length];
		for (int i=1; i<args.length; i++) {
			arrDouble[i] = Double.parseDouble(args[i]);
		}
		return arrDouble;
	}

	private static String nameOf(Object o) {
 		return o.getClass().getName();
	}

	private static String simpleNameOf(Object o) {
    	return o.getClass().getSimpleName();
	}

	public static String capitalizedFirstCharOfString(String s) {
        return s.substring(0, 1).toUpperCase() +
                s.substring(1).toLowerCase();
    }
}
