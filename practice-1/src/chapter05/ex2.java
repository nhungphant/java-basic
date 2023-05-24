package chapter05;

import java.util.Arrays;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m;
        do {
            System.out.println("Nhap vao kich thuoc cua Ma tran A (mxm): ");
            m = sc.nextInt();
        }
        while (m < 1);

        int A[][] = new int[m][m];
        System.out.println("Nhap cac phan tu cho Ma tran A");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("A[" + i + "," + j + "] = ");
                A[i][j] = sc.nextInt();
            }
        }
        System.out.println("1, Ma tran A vua nhap: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(A[i][j] + "\t");
            }
            System.out.print("\n");
        }

        int[] mainDiagonal = new int[m];
        int n = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                if (i == j) {
                    mainDiagonal[n] = A[i][j];
                    n++;
                }
            }
        }
        System.out.println("2, Duong cheo chinh cua A: " + Arrays.toString(mainDiagonal));

        int[] secDiagonal = new int[m];
        int k = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                if (i + j == m - 1) {
                    secDiagonal[k] = A[i][j];
                    k++;
                }
            }
        }
        System.out.println("3, Duong cheo phu cua A: " + Arrays.toString(secDiagonal));

        int[][] B = new int[m][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                if (i == j) {
                    B[i][j] = A[i][m - 1 - i];
                } else if (i + j == m - 1) {
                    B[i][j] = A[i][i];
                } else {
                    B[i][j] = A[i][j];
                }
            }
        }
        System.out.println("4, Ma tran sau khi hoan doi 2 duong cheo:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(B[i][j] + "\t");
            }
            System.out.print("\n");
        }
    }
}
