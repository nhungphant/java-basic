package chapter06;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap mot chuoi ky tu bat ky: ");
        String s1 = sc.nextLine();
        s1 = s1.trim().replaceAll("\\s+", " ");
        List<String> s1Elements = Arrays.stream(s1.split(" ")).toList();
        System.out.println(s1Elements);

        System.out.println("Nhap chuoi thu hai cung do dai: ");
        String s2 = sc.nextLine();
        s2 = s2.trim().replaceAll("\\s+", " ");
        List<String> s2Elements = Arrays.stream(s2.split(" ")).toList();
        System.out.println(s2Elements);

//        String swapString = "";
//        for (int i = 0; i < s1Elements.size(); i++) {
//            swapString += s1Elements.get(i) + " " + s2Elements.get(i) + " ";
//        }

        StringBuilder swapString = new StringBuilder();
        for (int i = 0; i < s1Elements.size(); i++) {
            swapString.append(s1Elements.get(i)).append(" ");
            swapString.append(s2Elements.get(i)).append(" ");
        }
        System.out.println(swapString.toString().trim());
    }
}
