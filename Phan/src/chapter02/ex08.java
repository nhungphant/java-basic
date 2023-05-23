package chapter02;

import java.util.Scanner;

public class ex08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap xau ky tu bat ky: ");
        String temp = sc.nextLine();
        temp = temp.trim().replaceAll("\\s+", " ");
        System.out.println("So tu: " + countWord(temp));
    }

    static int countWord(String temp) {
        int count = 1;
        for (int i = 0; i < temp.length(); i++) {
            if (temp.charAt(i) == ' ') {
                count++;
            }
        }
        return count;
    }
}
