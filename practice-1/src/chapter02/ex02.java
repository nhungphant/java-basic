package chapter02;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap mot so tu nhien bat ky: ");
        int a = sc.nextInt();
        while (a <= 0) {
            System.out.println("Xin vui long nhap lai: ");
            a = sc.nextInt();
        }
        System.out.println("Nhap he co so muon chuyen doi (1< b <= 36): ");
        int b = sc.nextInt();
        while (b <= 1 || b > 36) {
            System.out.println("Xin vui long nhap lai: ");
            b = sc.nextInt();
        }
        System.out.println("Ket qua chuyen doi: " + convert(a,b));
    }
    static String convert(int a, int b) {
        String answer = "";
        if (a<b) {
            answer = "F";
        } else {
            while (a/b >= 0) {
                if ((float)a/b == 0f) {
                    break;
                }
                answer = a%b + answer;
                a = a/b;
            }
        }
        return answer;
    }
}