class FactorianV1_0 {
	public static void main(String[] args) {
		int n = 7;
		int i = 1;
		int sum = 1;
		System.out.print(n + "! = ");
		System.out.print(i);
		for (i=1; i<=n; i++) {
			if(i<n) {
				System.out.print("x"+(i+1));
			}	
			sum = sum * i;
		}		
		System.out.println(" = "+sum);
	}
}
