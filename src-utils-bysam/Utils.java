import java.util.Arrays;
import java.text.Collator;

public class Utils {

	public static float vatRate = 0.07f;

	public static String capitalizedFirstChar(String s) {
		return s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();
	}

	public static String removeAllNumberic(String s) {
		return s.replaceAll("\\D", "");
	}

	public static String[] sortThaiString(String[] strArr) {
		Collator myCollator = Collator.getInstance();
		Arrays.sort(strArr, myCollator);
		return strArr;
	}
}