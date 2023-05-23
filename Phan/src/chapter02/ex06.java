package chapter02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so nguyen duong n: ");
        int n = sc.nextInt();
        while (n <= 0) {
            System.out.println("Xin vui long nhap lai: ");
            n = sc.nextInt();
        }
        System.out.println("Tong cac chu so cua n: " + Common.sum(n));
        System.out.println("Cac uoc cua n: "+ divisor(n));
        System.out.println("So cac uoc cua n: " + count(n));
        System.out.println("Cac uoc la so nguyen to cua n: " + prime(n));
    }

    private static int count(int n) {
        int count = 0;
        for (int m = 1; m <= n; m++) {
            if (n % m == 0) {
                count++;
            }
        }
        return count;
    }

    static List<Integer> prime(int n) {
        List<Integer> prime = new ArrayList<>();
        for (int m = 1; m <= n; m++) {
            if (n % m == 0) {
                if (Common.isPrime(m)) {
                    prime.add(m);
                }
            }
        }
        return prime;
    }

    static List<Integer> divisor(int n) {
        List<Integer> divisor = new ArrayList<>();
        for (int m = 1; m <= n; m++) {
            if (n % m == 0) {
                divisor.add(m);
            }
        }
        return divisor;
    }
}