import java.util.Arrays;

public class SortArrayString {

	public static String[] sort02(String[] arrStr) {
		Arrays.sort(arrStr);
		return arrStr;
	}

	public static void main(String[] args) {

		String[] arrStr1 = new String[args.length];
		for (int i=0; i<args.length; i++) {
			arrStr1[i] = args[i];
		}
		System.out.println("ก่อนการ sort");
		//System.out.println(Arrays.toString(arrStr1));
		System.out.println(Arrays.asList(arrStr1));
		System.out.println("===============================");
		System.out.println();
		System.out.println("หลังการ sort");
		//System.out.println(Arrays.toString(sort02(arrStr1)));
		System.out.println(Arrays.asList(sort02(arrStr1)));

		System.out.println("===============================");
	}
}