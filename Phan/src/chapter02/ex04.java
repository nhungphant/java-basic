package chapter02;

import java.util.Scanner;
import java.util.ArrayList;

public class ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap mot so nguyen bat ky: ");
        int n = sc.nextInt();

        if (n <= 2) {
            System.out.println("Khong co so nguyen to nho hon " + n);
        } else {
            ArrayList<Integer> prime = new ArrayList<Integer>();
            for (int m = 2; m < n; m++) {
                boolean flag = false;
                for (int i = 2; i <= Math.sqrt(m); i++) {
                    if (m % i == 0) {
                    flag = true;
                    break;
                    }
                }
                if (flag == true) {
                    continue;
                } else {
                    prime.add(m);
                }
            } System.out.println("So nguyen to nho hon " + n + " la: " + prime);
        }
    }
}
