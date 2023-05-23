package chapter04;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee em1 = new Employee();
        em1.setFirstName("Nhung");
        em1.setLastName("Phan");
        em1.setSalary(99.9);
        Employee em2 = new Employee();
        em2.setFirstName("Quan");
        em2.setLastName("Phan");
        em2.setSalary(111.1);
        System.out.println(em1.getSalary());
        System.out.println(em2.getSalary());
        em1.incrementSalary();
        em2.incrementSalary();
        System.out.println("========================================");
        System.out.printf("%.2f\n",em1.getSalary());
        System.out.println(em2.getSalary());
    }
}
