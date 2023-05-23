package chapter02;

import java.util.Scanner;

public class ex04a {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = s.nextInt();

        String primelist = "";

        for (int a = 2; a < n; a++) {
            if (isPrime(a)) {
                primelist += " " + a;
            } else {
                continue;
            }
        }
        System.out.println("The prime list is:" + primelist);
    }

    public static boolean isPrime(int a) {
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                return false;
            }
        } return true;
    }
}
