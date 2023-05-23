package chapter02;

import java.util.*;

public class ex09a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap xau ky tu bat ky: ");
        String temp = sc.nextLine();
        temp = temp.trim().replaceAll("\\s+", " ");

        List<String> listWords = Arrays.stream(temp.split(" ")).toList();
        System.out.println(listWords);
        String answer = "";
        for (int i = 0; i < listWords.size(); i++) {
            int count = 0;
            for (int j = 0; j < listWords.size(); j++) {
                if (listWords.get(j) != listWords.get(i)) {
                    continue;
                }
                count++;
            }
            answer += listWords.get(i) + " = " + count + "\n";
        }
        System.out.println(answer);
    }
}