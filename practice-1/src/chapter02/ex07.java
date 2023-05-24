package chapter02;

import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so nguyen duong n: ");
        int n = sc.nextInt();
        while (n <= 0) {
            System.out.println("Xin vui long nhap lai: ");
            n = sc.nextInt();
        }
        System.out.println("Tong cac chu so cua n la: " + Common.sum(n));
        System.out.println("Phan tich thua so nguyen to cua n: " + factor(n));
    }
    static String factor(int n) {
        String pf = "";
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0 && Common.isPrime(i)) {
                int x = n, count = 0;
                while (x % i == 0) {
                    count++;
                    x = x / i;
                }
                if (count > 1) {
                    pf += i + "^" + count + " * ";
                } else {
                    pf += i + " * ";
                }
            }
        }
        return pf.substring(0, pf.length() - 3);
    }
}