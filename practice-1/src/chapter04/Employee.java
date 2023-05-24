package chapter04;

public class Employee {
    private String firstName, lastName;
    private Double salary;

    public Employee() {
    }

    public Employee(String firstName, String lastName, Double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        if(salary < 0){
            this.salary = salary;
        } else{
            this.salary = salary;
        }
    }

    public Employee incrementSalary(){
        this.salary *=1.1;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Double getSalary() {
        if (salary < 0) {
            return 0.0;
        }
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}

