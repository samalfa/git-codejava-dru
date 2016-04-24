public class Adder  {

	private static double result = 0.0; 

	public static double add(String[] args) {
		double[] arrDouble = new double[args.length];
		for (int i=0; i<args.length; i++) {
			arrDouble[i] = Double.parseDouble(args[i]);
			//result = result+arrDouble[i];
			result += arrDouble[i];
		}
		return result;
	}
}
