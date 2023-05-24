package chapter02;

import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so phan tu cua Mang: ");
        int n = sc.nextInt();
        while (n <= 0) {
            System.out.println("Xin vui long nhap lai: ");
            n = sc.nextInt();
        }

        int[] myNum = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap phan tu thu " + (i+1));
            myNum[i] = sc.nextInt();
            sum += myNum[i];
        }

        System.out.println("Tong cac phan tu trong Mang: " + sum);
    }
}
