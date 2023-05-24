package chapter02;

import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);

    System.out.println("Ten cua ban: ");
    String a = sc.nextLine();

    System.out.println("Xin chao " + a);

    List<Integer> list = List.of(1, 2, 3);
    System.out.println(list);
  }
}