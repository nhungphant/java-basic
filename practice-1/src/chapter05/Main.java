package chapter05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<ex3> listStudents = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("So thu tu cua sinh vien (Nhap 0 neu muon ket thuc): ");
        int flag = Integer.parseInt(sc.nextLine());
        while (flag != 0) {
            ex3 student = new ex3();
            System.out.println("Nhap ten sinh vien: ");
            student.setFullName(sc.nextLine());
            System.out.println("Nhap tuoi sinh vien: ");
            student.setAge(Integer.parseInt(sc.nextLine()));
            System.out.println("Nhap diem mon Toan: ");
            student.setMath(Double.parseDouble(sc.nextLine()));
            System.out.println("Nhap diem mon Ly: ");
            student.setPhysics(Double.parseDouble(sc.nextLine()));
            System.out.println("Nhap diem mon Hoa: ");
            student.setChemistry(Double.parseDouble(sc.nextLine()));
            listStudents.add(student);
            System.out.println("So thu tu cua sinh vien (Nhap 0 neu muon ket thuc): ");
            flag = Integer.parseInt(sc.nextLine());
        }

        double CNTTscore = 26.5;
        double DTVTscore = 20.0;
        double DTscore = 18.5;
        System.out.println("Ten \t Diem \t CNTT(26) \t DTVT(20) \t DT(18.5)");
        for (
                ex3 s : listStudents) {
            System.out.println(s.getFullName() + "\t\t" + s.getSum() + "\t\t"
                    + s.isPassed(CNTTscore) + "\t\t"
                    + s.isPassed(DTVTscore) + "\t\t"
                    + s.isPassed(DTscore));
        }
    }
}
