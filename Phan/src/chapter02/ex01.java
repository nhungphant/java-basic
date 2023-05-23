package chapter02;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Nhap so tu nhien a: ");
        int a = sc.nextInt();
        while (a <= 0) {
            System.out.println("Xin vui long nhap gia tri lon hon 0: ");
            a = sc.nextInt();
        }

        System.out.println("Nhap so tu nhien b: ");
        int b = sc.nextInt();
        while (b <= 0) {
            System.out.println("Xin vui long nhap gia tri lon hon 0: ");
            b = sc.nextInt();
        }

        System.out.println("The GCD of two numbers is: " + findGCD(a,b));
    }
    static int findGCD(int a, int b)
    {
        int r = 0, x, y;
        x = (a > b) ? a : b; // a is greater number
        y = (a < b) ? a : b; // b is smaller number
        r = y;
        while(x % y != 0)
        {
            r = x % y;
            x = y;
            y = r;
        }
        return r;
    }
}