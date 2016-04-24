import java.util.Arrays;

class M5533470001 {
	//1
	public static int float2int01(float num) {
		return (int)num;
	}
	//2
	public static String oddOrEven02(int num) {
		String s;
		if(num%2 == 0) {
			return s = "Even";
		}
		return s = "Odd";	
	}
	//3
	public static int[] sort03(int[] arr) {
		Arrays.sort(arr);
		return arr;
	}

	//4
	public static String grade04(int num) {
		String s;
		if(num >= 0 && num <= 49) {
			return s = "E";
		} else if(num >= 50 && num <= 59) {
			return s = "D";
		} else if(num >= 60 && num <= 69) {
			return s = "C";
		} else if(num >= 70 && num <= 79) {
			return s = "B";
		} else {
			return s = "A";
		}
	}	

	//5
	public static double vat05(double num) {
			double sum = 0;
			double vat = num*0.07;
			return sum = num + vat;
	}

	//6
	//7
	public static void commission07(int com) {
		double calcom = 0.0;
		if(com >= 30000) {
			calcom = com * 0.15;
		} else if(com >= 10000 && com <= 29999) {
			calcom = com * 0.10;
		} else if(com >= 5000 && com <= 9999) {
			calcom = com * 0.05;
		} else {
			calcom = 0.0;
		}
		System.out.println("ยอดขาย = "+com+" Commission = "+calcom+ " บาท");
	}
	
	//8
	public static int abs08(int num) {
		return num = ~(num - 1);
	}

	//9
	public static long power09(int base, int num) {
		long power;
		return power = (long)(Math.pow((double)base, (double)num));
	}

	//10
	public static float int2float10(int num) {
		return (float)num;
	}

	public static void main(String[] args) {
		//1
		//System.out.println(float2int01(4.5f));
		//2
		//System.out.println(oddOrEven02(5));
		
		
		//3
		// int[] arr1 = {4,1,5,3,2,6,7,10,9,8};
		// System.out.println(Arrays.toString(sort03(arr1)));

		//3.1
		//int[] arr1 = {Integer.parseInt(args[0]), Integer.parseInt(args[1]), Integer.parseInt(args[2]), Integer.parseInt(args[3])};
		//System.out.println(Arrays.toString(sort03(arr1)));
		
		//3.2
		int[] arr1 = new int[args.length];
		for (int i=0; i<args.length; i++) {
			arr1[i] = Integer.parseInt(args[i]);
		}
		System.out.println(Arrays.toString(sort03(arr1)));
		


		//4
		//System.out.println(grade04(53)); 
		//5
		//System.out.println("ผลรวมพร้อมภาษี 7% = " + vat05(200));
		//6
	
		//7
		//commission07(9000);

		//8
		//System.out.println(abs08(-9));

		//9
		//System.out.println(power09(2, 4));
		
		//10
		//System.out.println(int2float10(4));
	}
}