package chapter02;

import java.util.Arrays;
import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so phan tu cua Mang: ");
        int n = sc.nextInt();
        while (n <= 0) {
            System.out.println("Xin vui long nhap lai: ");
            n = sc.nextInt();
        }

        int[] myNum = new int[n];
        for (int m = 0; m < n; m++) {
            System.out.println("Nhap phan tu thu " + (m + 1));
            myNum[m] = sc.nextInt();
        }
        Arrays.sort(myNum);
        System.out.println("Ket qua sap xep: " + Arrays.toString(myNum));

        myNum = Arrays.copyOf(myNum, n + 1);
        System.out.println("Nhap vao gia tri x them vao Mang: ");
        int x = sc.nextInt();

        for (int i = 0; i < n + 1; i++) {
            if (myNum[i] < x && x < myNum[i + 1]) {
                for (int j = n; j > i+1; j--) {
                    myNum[j] = myNum[j-1];
                }
                myNum[i + 1] = x;
            }
            continue;
        }
        System.out.println("Ket qua sau khi them x: " + Arrays.toString(myNum));
    }
}
