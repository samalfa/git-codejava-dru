public class Length {

	public static void testStringArray(String[] args) {
		// Variable.length ใช้เพื่อหาจำนวนสมาชิกของตัวแปร Array 
		System.out.print("ขนาดของ String args[] : ");
		System.out.println(args.length);
		System.out.println("======================================");
		System.out.println();

		// stringVariable.length() ใช้เพื่อหาขนาดความยาวของตัวอักษรภายในตัวแปร String
		for (int i=0; i<args.length; i++) {
			System.out.printf("args[%d] = %d \n", i, args[i].length());	
			System.out.printf("Data for args[%d] = %s \n", i, args[i]);
			System.out.println("======================================");
		}
	}

	public static void testIntArray() {
		int[] number = {123, 456, 789, 1000};
		// Variable.length ใช้เพื่อหาจำนวนสมาชิกของตัวแปร Array 
		System.out.println();
		System.out.println();
		System.out.print("ขนาดของ String number[] : ");
		System.out.println(number.length);
		System.out.println("======================================");
		System.out.println();

		// stringVariable.length() ใช้เพื่อหาขนาดความยาวของตัวอักษรภายในตัวแปร String
		for (int i=0; i<number.length; i++) {
			//System.out.printf("number[%d] = %d \n", i, number[i].length()); //ใช้แบบนี้ไม่ได้เพราะไม่ใช่ String	
			System.out.printf("Data for number[%d] = %s \n", i, number[i]);
			System.out.println("======================================");
		}
	}

	public static void main(String[] args) {
		testStringArray(args);
		testIntArray();

	}
}