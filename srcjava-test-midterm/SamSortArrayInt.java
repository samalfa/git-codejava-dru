import java.util.Arrays;

public class SamSortArrayInt {

	// หมดกำลังภายในไปหลายส่วนสำหรับการแก้โจทย์ข้อ 3.
	public static int[] sort03(int[] arr) {
		Arrays.sort(arr);
		return arr;
	}

	public static void main(String[] args) {
		//3.1
		// int[] arr1 = {4,1,5,3,2,6,7,10,9,8};
		// System.out.println("หมดกำลังภายในไปหลายส่วนสำหรับการแก้โจทย์ข้อ 3. ผลการ sort int[] ดังนี้");
		// System.out.println();
		// System.out.println("ก่อนการ sort");
		// System.out.println(Arrays.toString(arr1));
		// System.out.println("===============================");
		// System.out.println("หลังการ sort");

		//Method 1: Method sort03(int arr) is defiled with int[] return type.
		// System.out.println(Arrays.toString(sort03(arr1)));
		// System.out.println("===============================");
		
		//Method 2: Use Arrays.sort(param) with void type of method.
		// Arrays.sort(arr1);
		// System.out.println(Arrays.toString(arr1));
		// System.out.println("===============================");

		//3.2
		// int[] arr2 = {Integer.parseInt(args[0]), Integer.parseInt(args[1]), Integer.parseInt(args[2]), Integer.parseInt(args[3])};
		// System.out.println(Arrays.toString(sort03(arr2)));
		
		//3.3
		int[] arr3 = new int[args.length];
		for (int i=0; i<args.length; i++) {
			arr3[i] = Integer.parseInt(args[i]);
		}
		System.out.println("ก่อนการ sort");
		System.out.println(Arrays.toString(arr3));
		System.out.println("===============================");
		System.out.println();
		System.out.println("หลังการ sort");
		System.out.println(Arrays.toString(sort03(arr3)));
		System.out.println("===============================");
	}
}