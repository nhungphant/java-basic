package chapter13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List <SinhVien> sinhVienList = new ArrayList<>();
        SinhVien s1 = new SinhVien();
        System.out.println("Nhap ma sinh vien (Nhap 0 de ket thuc):");
        s1.setMaSinhVien(sc.nextLine());
        System.out.println("Nhap ho va ten sinh vien:");
        s1.setHoTen(sc.nextLine());
        System.out.println("Nhap diem sinh vien: ");
        try {
            s1.setDiem(Integer.parseInt(sc.nextLine()));
            System.out.println("Hoan thanh");
        }
        catch (Exception e) {
            e.printStackTrace();
            System.out.println("Vui long nhap lai");
            s1.setDiem((Integer.parseInt(sc.nextLine())));
        }
    }
}
