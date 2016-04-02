package helpers;
import java.util.Scanner;

public class HelperInput {

	public static double inputDouble() {
		Scanner input = new Scanner(System.in);
		return input.nextDouble();
	}

	public static int inputInt() {
		Scanner input = new Scanner(System.in);
		return input.nextInt();
	}

	public static String inputString() {
		Scanner input = new Scanner(System.in);
		return input.nextLine();
	}
}
