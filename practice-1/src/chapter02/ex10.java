package chapter02;

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap ho ten day du: ");
        String fullName = sc.nextLine();
        fullName = fullName.trim().replaceAll("\\s+", " ");
        String[] nameElements = fullName.split(" ");

        String surname = "";
        for (int i = 0; i < nameElements.length-1; i++) {
            surname += " " + nameElements[i];
        }
        System.out.println(nameElements[nameElements.length-1] + surname);
    }
}
