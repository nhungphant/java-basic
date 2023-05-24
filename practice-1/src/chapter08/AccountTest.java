package chapter08;

import java.util.Scanner;

public class AccountTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//        for (Menu button : Menu.values()) {
//            System.out.println(button.getButtonNum() + ". " + button.getButtonContent());
//        }
		Account account = new Account();
		account.setdAmount(686868.68);
		account.setbBalance(686868.68);

		boolean temp = true;
		while (temp) {
			System.out.println("Nhap menu: ");
			Menu selected = Menu.valueOf(sc.nextLine());

			switch (selected) {
				case ONE:
					System.out.println("So tien gui: ");
					double dDepAmount = Double.parseDouble(sc.nextLine());
					System.out.println("So du tai khoan hien tai: " + account.deposit(dDepAmount));
					break;
				case TWO:
					System.out.println("So tien rut: ");
					double dWdrAmount = Double.parseDouble(sc.nextLine());
					System.out.println("So du tai khoan hien tai: " + account.withdraw(dWdrAmount));
					break;
				case THREE:
					System.out.println("So du tai khoan hien tai: " + account.getdAmount());
					break;
				case FOUR:
					temp = false;
					break;
			}
		}

	}
}
