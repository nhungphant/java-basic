package phone;

import phone.lg.LG;
import phone.nokia.Nokia;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		System.out.println("1. Input");
		System.out.println("2. Display");
		System.out.println("3. Sort");
		System.out.println("4. Search");
		System.out.println("5. Exit");

		List<Nokia> nokiaList = new ArrayList<Nokia>();
		List<LG> lgList = new ArrayList<LG>();

		Scanner sc = new Scanner(System.in);
		boolean temp = true;
		while (temp) {
			System.out.println("Chon menu: ");
			int selected = Integer.parseInt(sc.nextLine());
			if (selected < 1 || selected > 5) {
				System.out.println("Please try again");
			}
			else {
				switch (selected) {
					case 1:
						System.out.println("Chon loai dien thoai muon nhap: ");
						System.out.println("1. Nokia");
						System.out.println("2. LG");
						int brand = Integer.parseInt(sc.nextLine());
						if (brand < 1 || brand > 2) {
							System.out.println("Please try again");
						}
						else {
							switch (brand) {
								case 1:
									int num1;
									System.out.println("So thu tu (Nhap 0 neu muon dung nhap): ");
									num1 = Integer.parseInt(sc.nextLine());
									while (num1 != 0) {
										Nokia nokia = new Nokia();
										nokia.inputInfo();
										nokiaList.add(nokia);
										System.out.println("So thu tu (Nhap 0 neu muon dung nhap): ");
										num1 = Integer.parseInt(sc.nextLine());
									}
									break;
								case 2:
									int num2;
									System.out.println("So thu tu (Nhap 0 neu muon dung nhap): ");
									num2 = Integer.parseInt(sc.nextLine());
									while (num2 != 0) {
										LG lg = new LG();
										lg.inputInfo();
										lgList.add(lg);
										System.out.println("So thu tu (Nhap 0 neu muon dung nhap): ");
										num2 = Integer.parseInt(sc.nextLine());
									}
									break;
							}
						}
					case 2:
						int stt2 = 1;
						for (Nokia nokia : nokiaList) {
							System.out.println("Thong tin dien thoai Nokia so " + stt2 + ": ");
							nokia.displayInfo();
							System.out.println("\n");
							stt2++;
						}
						for (LG lg : lgList) {
							System.out.println("Thong tin dien thoai LG so " + stt2 + ": ");
							lg.displayInfo();
							System.out.println("\n");
							stt2++;
						}
						break;
					case 3:
						List<Nokia> sortedNokia = new ArrayList<Nokia>();
						sortedNokia = nokiaList.stream().sorted((Comparator.comparing(Nokia::getWarranty))).toList();
						int countnokia = 1;
						for (Nokia nokia : sortedNokia) {
							System.out.println("Thong tin dien thoai Nokia so " + countnokia + ": ");
							nokia.displayInfo();
							System.out.println("\n");
							countnokia++;
						}
						List<LG> sortedLG = new ArrayList<LG>();
						sortedLG = lgList.stream().sorted((Comparator.comparing(LG::getWarranty))).toList();
						int countlg = 1;
						for (LG lg : sortedLG) {
							System.out.println("Thong tin dien thoai LG so " + countlg + ": ");
							lg.displayInfo();
							System.out.println("\n");
							countlg++;
						}
						break;
					case 4:
						System.out.println("Nhap tu khoa tim kiem: ");
						String searchTerm = ".*" + sc.nextLine() + ".*";
						for (Nokia nokia : nokiaList) {
							if (nokia.getName().matches(searchTerm)) {
								nokia.displayInfo();
							}
						}
						for (LG lg : lgList) {
							if (lg.getName().matches(searchTerm)) {
								lg.displayInfo();
							}
						}
						break;
					case 5:
						System.out.println("Thank you!");
						temp = false;
						break;
				}
			}
		}
	}
}
