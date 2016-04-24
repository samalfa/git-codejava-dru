public class Calculator {

	private double result = 0.0;

	public double add(double[] num) {
		for (int i=1; i<num.length; i++) {
			result += num[i];	// result = result+num[i];
		}
		return result;
	}

	public double add(double num1, double num2) {
		return result = num1 + num2;
	}

	public double sub(double[] num) {
		result = num[1];
		for (int i=2; i<num.length; i++) {
			result = result-num[i];
		}
		return result;
	}

	public double sub(double num1, double num2) {
		return result = num1 - num2;
	}

	public double multi(double[] num) {
		result = num[1];
		for (int i=2; i<num.length; i++) {
			result = result * num[i];
		}
		return result;
	}

	public double multi(double num1, double num2) {
		return result = num1 * num2;
	}

	public double divi(double num1, double num2) {
		return result = num1/num2;
	}

	public void showResult(String[] args) {
		System.out.println();
		System.out.println("Calculator Programming By SamAlfa");
		System.out.println();
		if(args[0].equals("-add")) {
			if(args.length > 3) {
				add(Utils.stringToDouble(args));
			} else if(args.length == 3) {
				add(Double.parseDouble(args[1]), Double.parseDouble(args[2]));
			} else {
				showException();
				System.exit(0);
			}
			drawEqualLine(args); //
			System.out.print("Summary of: ");
			loopForDetail(args);
		} else if(args[0].equals("-sub")) {
			if(args.length > 3) {
				sub(Utils.stringToDouble(args)); 
			} else if(args.length == 3) { 
				sub(Double.parseDouble(args[1]), Double.parseDouble(args[2]));
			} else { 
				showException();
				System.exit(0); 
			}
			drawEqualLine(args); //
			System.out.print("Subtract of: ");
			loopForDetail(args);
		} else if(args[0].equals("-multi")) {
			if(args.length > 3) {
				multi(Utils.stringToDouble(args)); 
			} else if(args.length == 3) { 
				multi(Double.parseDouble(args[1]), Double.parseDouble(args[2]));
			} else { 
				showException();
				System.exit(0); 
			}
			drawEqualLine(args); //
			System.out.print("Multiple of: ");
			loopForDetail(args);
		} else if(args[0].equals("-divi")) {
			divi(Double.parseDouble(args[1]), Double.parseDouble(args[2]));
			drawEqualLine(args); //
			System.out.print("Dividual of: ");
			loopForDetail(args);
		} else {
			System.out.println("Error, Plesae use argument <-add>, <-sub>, <-multi>, <-divi> before Numbber.");
			System.out.println();
			showException();
			System.exit(0);
		}
		drawEqualLine(args); //
	}

	public void loopForDetail(String[] args) {
		for (int i=1; i<args.length; i++) {
			if(i == args.length-1) {
				System.out.print(args[i]);
			} else {
				if(args[0].equals("-add")) {
					System.out.print(args[i]+"+");
				} else if(args[0].equals("-sub")) {
					System.out.print(args[i]+"-");
				} else if(args[0].equals("-multi")) {
					System.out.print(args[i]+"x");
				} else if(args[0].equals("-divi")) {
					System.out.print(args[i]+"/");
				}
			}
		}
		//System.out.println(" = "+result);
		System.out.printf(" = %,.2f\n",result);
	}

	public void showException() {
		System.out.println("=======================================================");
		System.out.println("Please Run with format : java Calculator -add 12 20 N");
		System.out.println("=======================================================");
		System.out.println();
	}

	public void drawEqualLine(String[] args) {
		int sumArgs = 0;
		for(int i=1; i<args.length; i++) {
			sumArgs += args[i].length();
		}
		for(int j=0; j <= sumArgs+(args.length-2)+18; j++) {
			System.out.print("=");
		}
		System.out.println();
	}
}
