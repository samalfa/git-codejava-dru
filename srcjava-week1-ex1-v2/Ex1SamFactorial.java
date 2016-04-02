package week1;
import week1.ex1.*;

public class Ex1SamFactorial {
	public static void main(String[] args) {
		//int tmp;
		System.out.println("โปรแกรมคำนวณผลรวมของแฟคทอเรียล N จำนวน โดย Sam Alfa");
		do {
			new SumFactorialV2_1();
			//tmp = SumFactorialV2_1.getNumber();
		} while (SumFactorialV2_1.getNumber() != 0);
	}
}
