package chapter02;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap mot so nguyen bat ky: ");
        int a = sc.nextInt();
        int sum = 0;
        while (a != 0) {
            sum = sum + a%10;
            a = a/10;
        }
        System.out.println("Tong cua cac chu so la: " + sum);
    }
    public static void init(int a, int sum){
        while (a != 0) {
            sum = sum + a%10;
            a = a/10;
        }
    }
}
