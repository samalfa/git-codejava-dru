import java.util.Arrays;

public class TestMidTermSortArray {

	// Method Sort Array ชนิดคืนค่าเป็น int[]
	public static int[] sort03(int[] arr) {
		Arrays.sort(arr);
		return arr;
	}

	public static void main(String[] args) {

		int[] arr3 = new int[args.length];			// กำหนดตัวแปล Array ชนิด int มีมิติเท่ากับขนาด args.length
		for (int i=0; i<args.length; i++) {			// วน loop เพื่อรับค่าทาง command line: java TestMidTermSortArray 3 6 8 1 4 2 9 10
				 									// (ตัวเลขไม่จำกัดจำนวน)
			arr3[i] = Integer.parseInt(args[i]);	// แปลงข้อมูลชนิด String[] args ให้เป็น int แล้วเก็บใน arr3[index]
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