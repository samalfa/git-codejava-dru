import java.util.Arrays;

 public class NameOf {

 	// excample to use
 	// ((Object) myVar).getClass().getName();
	// Or
	// ((Object)myInt).getClass().getSimpleName();

 	private static String nameOf(Object o) {
 		return o.getClass().getName();
	}

	private static String simpleNameOf(Object o) {
    	return o.getClass().getSimpleName();
	}

 	public static void main(String[] args) {
 		String n[] = new String[3];
 		n[0] = "9 10 11 12";
 		n[1] = "5 6 7 8";
 		n[2] = "1 2 3 4";
 		System.out.println("จำนวนสมาชิกของ String Array n = "+n.length);
 		System.out.println("ขนาดของ String Array n[0] = "+n[0].length());
 		System.out.println("==============================");
 		System.out.println(simpleNameOf(n));
 		System.out.println(nameOf(n));
 		System.out.println("==============================");
 		System.out.println(simpleNameOf(Arrays.toString(n)));
 		System.out.println(nameOf(Arrays.toString(n)));
 		System.out.println("==============================");
 		Arrays.sort(n);
 		System.out.println(Arrays.asList(n));
 		System.out.println("==============================");
 		System.out.println(Arrays.toString(n));
 	}
 }