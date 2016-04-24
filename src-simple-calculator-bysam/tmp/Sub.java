public class Sub {

	private static double result = 0.0; 

	public static double sub(String[] args) {
		double[] arrDouble = new double[args.length];
		result = arrDouble[0] = Double.parseDouble(args[0]);
		for (int i=1; i<args.length; i++) {
			arrDouble[i] = Double.parseDouble(args[i]);
			//result = result-arrDouble[i];
			result -= arrDouble[i];
		}
		return result;
	}

	public static void showResult(String[] args) {
		System.out.print("ผลลบของ ");
		for (int i=0; i<args.length; i++) {
			if (i == args.length-1) {
				System.out.print(args[i]);
			} else {
				System.out.print(args[i]+"-");
			}
		}
		//System.out.println(" = "+result);
		System.out.printf(" = %,.2f\n",result);
	}

	public static void main(String[] args) {
		sub(args);
		showResult(args);
	}
}