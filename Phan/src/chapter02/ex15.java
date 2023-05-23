package chapter02;

import java.util.Scanner;

public class ex15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rowNum, columnNum;
        do {
            System.out.println("So hang cua Ma tran: ");
            rowNum = sc.nextInt();
            System.out.println("So cot cua Ma tran: ");
            columnNum = sc.nextInt();
        } while (rowNum < 1 || columnNum < 1);

        int A[][] = new int[rowNum][columnNum];
    }
}
