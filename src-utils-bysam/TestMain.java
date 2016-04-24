import java.util.Arrays;

public class TestMain {
	public static void main(String[] args) {
		System.out.println("ก่อนเรียง "+Arrays.asList(args));
		Utils.sortThaiString(args);
		System.out.println("หลังเรียง "+Arrays.asList(args));
	}
}