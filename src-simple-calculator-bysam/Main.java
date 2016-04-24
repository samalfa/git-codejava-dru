public class Main {

	public static void main(String[] args) {

		Calculator cal1 = new Calculator();

		try {
			cal1.showResult(args);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Error Catch by SamAlfa = 'ArrayIndexOutOfBoundsException'");
			System.out.println();
			cal1.showException();
		} catch (NumberFormatException e) {
			System.out.println("Error Catch by SamAlfa = 'NumberFormatException'");
			System.out.println();
			cal1.showException();
		}
	}
}
