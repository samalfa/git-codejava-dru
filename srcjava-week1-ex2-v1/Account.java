package week1.ex2;
import codecolors.CodeColors;

public class Account {

	public static double balance;

	public void getBalance() {
		System.out.println(CodeColors.GREEN + "คุณมียอดเงินในบัญชีจำนวน: "+balance+" บาท" + CodeColors.RESET);
	}

	public void deposit(double amount) {
		balance = balance+amount;
		System.out.println(CodeColors.GREEN + "คุณมียอดเงินในบัญชีจำนวน: "+balance+" บาท" + CodeColors.RESET);
	}

	public void withdrawal(double amount) {
		if (amount > (balance - (balance%100))) {
			System.out.println(CodeColors.RED + "ไม่สามารถถอนเงินได้ คุณมียอดเงินคงเหลืไม่พอ!!!" + CodeColors.RESET);
		} else {
			balance = balance - amount;
			System.out.println(CodeColors.YELLOW + "ถอนเงินจำนวน: "+amount+" บาท เรียบร้อย" + CodeColors.RESET);
			System.out.println(CodeColors.GREEN + "คุณมียอดเงินคงเหลือ: "+balance+" บาท" + CodeColors.RESET);
		}		
	}
}
