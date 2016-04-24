public class Adder  {

	private int number;

	public Adder(int num1, int num2) {
		System.out.printf("ผลบวกของ %d+%d = %d\n",num1, num2, num1+num2);
		number = num1+num2;
	}

	public static void main(String[] args) {
		new Adder(4, 5);
	}
}
