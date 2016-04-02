package week1;
import week1.ex2.*;
import helpers.HelperInput;
import codecolors.CodeColors;

public class Ex2SamAccount {
	public static void main(String[] args) {
		int choice;
		double amount;
		System.out.println("โปรแกรมจำลองระบบถอนเงินจากบัญชีธนาคาร (ด้วยเครื่อง ATM) โดย Sam Alfa");
		Account account = new Account();
		new CodeColors();
		do {
			System.out.println("Input choice: 0 = ออกจากโปรแกรม");
			System.out.println("Input choice: 1 = ตรวจสอบยอดเงินคงเหลือ");
			System.out.println("Input choice: 2 = ฝากเงินเข้าบัญชี");
			System.out.println("Input choice: 3 = ถอนเงิน");
			System.out.print("Input choice: ");
			choice = new HelperInput().inputInt();
			switch (choice) {
				case 1 :
					account.getBalance();
					break;
				case 2 :
					System.out.print("Input จำนวนเงินที่ต้องการฝากเข้าบัญชี: ");
					amount = new HelperInput().inputDouble();
					account.deposit(amount);
					// if ((amount%100) != 0) {
					// 		do {
					// 			System.out.print(CodeColors.RED + "กรุณาใส่จำนวนเงินป็นจำนวนเต็มหลักร้อย :" + CodeColors.RESET);
					// 			amount = new HelperInput().inputDouble();
					// 		} while ((amount%100) != 0);
					// 		account.deposit(amount);
					// 	} else { account.deposit(amount); }
					break;
				case 3 :
					if (account.balance == 0) {System.out.println(CodeColors.RED + "ไม่สามารถถอนเงินได้ คุณมียอดเงินคงเหลือ 0.0 บาท" + CodeColors.RESET);} 
					else {
						System.out.print("Input จำนวนเงินที่ต้องการถอน" + CodeColors.RED + " (ต้องเป็นจำนวนเต็มหลักร้อย): " + CodeColors.RESET);
						amount = new HelperInput().inputDouble();
						if ((amount%100) != 0) {
							do {
								System.out.print(CodeColors.RED + "กรุณาใส่จำนวนเงินป็นจำนวนเต็มหลักร้อย :" + CodeColors.RESET);
								amount = new HelperInput().inputDouble();
							} while ((amount%100) != 0);
							account.withdrawal(amount);
						} else {account.withdrawal(amount);}
					}
					break;
				default :
					break;
			}
			System.out.println("============================================");
		} while (choice != 0);
	}
}
