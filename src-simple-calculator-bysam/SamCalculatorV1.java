public class SamCalculatorV1 {

	private static double result;

	public static double add(String[] args) {
		double[] arrDouble = new double[args.length];
		for (int i=1; i<args.length; i++) {
			arrDouble[i] = Double.parseDouble(args[i]);
			//result = result+arrDouble[i];
			result += arrDouble[i];
		}
		return result;
	}

	public static double sub(String[] args) {
		double[] arrDouble = new double[args.length];
		result = arrDouble[1] = Double.parseDouble(args[1]);
		for (int i=2; i<args.length; i++) {
			arrDouble[i] = Double.parseDouble(args[i]);
			//result = result-arrDouble[i];
			result -= arrDouble[i];
		}
		return result;
	}

	public static void showResult(String[] args) {
		
		if(args[0].equals("-add")) {
			add(args);
			drawEqualLine(args);
			System.out.print("ผลบวกของ: ");
		} else if(args[0].equals("-sub")) {
			sub(args);
			drawEqualLine(args);
			System.out.print("ผลลบของ : ");
		} else {
			System.out.println("Error Plesae use argument <-add> or <-sub> before Numbber.");
			showException();
			System.exit(0);
		}

		for (int i=1; i<args.length; i++) {
			if(i == args.length-1) {
				System.out.print(args[i]);
			} else {
				if(args[0].equals("-add")) {
					System.out.print(args[i]+"+");
				} else if(args[0].equals("-sub")) {
					System.out.print(args[i]+"-");
				}	
			}
		}
		//System.out.println(" = "+result);
		System.out.printf(" = %,.2f\n",result);
		drawEqualLine(args);
	}

	public static void showException() {
		System.out.println("====================================================================================");
		System.out.println("กรุณาใช้ Argument : -add หรือ -sub และตามด้วย ตัวเลขจำนวนที-่1 ตัวเลขจำนวนที่-2 ...ตัวเลขจำนวนที่-N");
		System.out.println("====================================================================================");
	}

	public static void drawEqualLine(String[] args) {
		int sumArgs = 0;
		for(int i=1; i<args.length; i++) {
			sumArgs += args[i].length();
		}
		for(int j=0; j <= sumArgs+(args.length-2)+18; j++) {
			System.out.print("=");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		try {
			showResult(args);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Error ArrayIndexOutOfBoundsException");
			showException();
		} catch (NumberFormatException e) {
			System.out.println("Error NumberFormatException");
			showException();
		}
	}
}
