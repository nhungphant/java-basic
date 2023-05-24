package chapter05;

public class ex3 {
    private String fullName;
    private Integer age;
    private Double math, physics, chemistry;

//    public ex3(String fullName, Integer age, Double math, Double physics, Double chemistry) {
//        this.fullName = fullName;
//        this.age = age;
//        if (math < 0.0) {
//            this.math = 0.0;
//        } else {
//            this.math = math;
//        }
//        if (physics < 0.0) {
//            this.physics = 0.0;
//        } else {
//            this.physics = physics;
//        }
//        if (chemistry < 0.0) {
//            this.chemistry = 0.0;
//        } else {
//            this.chemistry = chemistry;
//        }
//    }

    public ex3() {
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getMath() {
        return math;
    }

    public void setMath(Double math) {
        this.math = math;
    }

    public Double getPhysics() {
        return physics;
    }

    public void setPhysics(Double physics) {
        this.physics = physics;
    }

    public Double getChemistry() {
        return chemistry;
    }

    public void setChemistry(Double chemistry) {
        this.chemistry = chemistry;
    }

    public Double getSum() {
        return (math + physics + chemistry);
    }

    public String isPassed(double score) {
        return (getSum() >= score) ? "Passed" : "Failed";
    }
}
