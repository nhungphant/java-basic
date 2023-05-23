package chapter02;

import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so phan tu cua Mang: ");
        int n = sc.nextInt();
        while (n <= 0) {
            System.out.println("Xin vui long nhap lai: ");
            n = sc.nextInt();
        }

        int[] myNum = new int[n];
        String answer = "";
        for (int m = 0; m < n; m++) {
            System.out.println("Nhap phan tu thu " + (m + 1));
            myNum[m] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            boolean existed = false;
            for (int j = 0; j < i; j++) {
                if (myNum[j] == myNum[i]) {
                    existed = true;
                    break;
                }
            }
            int count = 0;
            if (existed == false) {
                for (int k = 0; k < n; k++) {
                    if (myNum[i] == myNum[k]) {
                        count++;
                    }
                }
            }
            if (count == 2) {
                answer += " " + myNum[i];
            }
        }
        System.out.println("Cac phan tu xuat hien 2 lan:" + answer);
    }
}
