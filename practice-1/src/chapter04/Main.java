package chapter04;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        String DOB;
//        DOB = "04/12/1999";
//        LocalDate date = LocalDate.parse(DOB, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
//        System.out.println(DOB);
//        System.out.println(DOB.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        Student a = new Student("ATT", "03/01/1999", 9.0, 8.0, 7.0);
        Student b = new Student("DTNL", "03/01/1999", 9.0, 7.0, 9.0);
        Student c = new Student("PTN", "03/01/1999", 10.0, 8, 9);
        List<Student> listStudent = new ArrayList<>();
        listStudent.add(b);
        listStudent.add(a);
        listStudent.add(c);
        System.out.println(listStudent);
        System.out.println("=======================");

        List<Student> sortedList = listStudent.stream().sorted(Comparator.comparing(Student::getAverage)).toList();
        System.out.println(sortedList);
//        List<Student> sortedList = new ArrayList<>();
//        Collections.sort(listStudent);
//        System.out.println(listStudent);
        System.out.println("======================");

        for(Student student : listStudent){
            if (student.getFullName().contains("A")){
                System.out.println(student);
            }
        }
    }
}
