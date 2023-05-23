package chapter02;

import java.util.Scanner;

public class ex14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A[][] = new int[3][3];
        int B[][] = new int[3][3];

        System.out.println("Nhap cac phan tu cho Ma tran A");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("A[" + i + "," + j + "] = ");
                A[i][j] = sc.nextInt();
            }
        }

        System.out.println("Nhap cac phan tu cho Ma tran B");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("B[" + i + "," + j + "] = ");
                B[i][j] = sc.nextInt();
            }
        }

        System.out.println("Ma tran A: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(A[i][j] + "\t");
            }
            System.out.print("\n");
        }

        System.out.println("Ma tran B: ");
        for (int m = 0; m < 3; m++) {
            for (int n = 0; n < 3; n++) {
                System.out.print(B[m][n] + "\t");
            }
            System.out.print("\n");
        }
    }

    static int[][] Add(int A[][], int B[][], int C[][]) {
        return null;
    }
}
