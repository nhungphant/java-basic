package chapter04;

public class Student {
    private String fullName;
    private String DOB;
    private Double math, physics, chemistry;

    public Student(String fullName, String DOB, double math, double physics, double chemistry) {
        this.fullName = fullName;
        this.DOB = DOB;
        if (math < 0.0) {
            this.math = 0.0;
        } else {
            this.math = math;
        }
        if (physics < 0.0) {
            this.physics = 0.0;
        } else {
            this.physics = physics;
        }
        if (chemistry < 0.0) {
            this.chemistry = 0.0;
        } else {
            this.chemistry = chemistry;
        }
    }

    public Double getAverage() {
        return (double) (this.chemistry + this.math + this.physics) / 3;
    }

    @Override
    public String toString() {
        return "{" +
                "fullName='" + fullName + '\'' +
                ", DOB='" + DOB + '\'' +
                ", math=" + math +
                ", physics=" + physics +
                ", chemistry=" + chemistry +
                '}' + "\n";
    }

//    @Override
//    public int compareTo(Student o) {
//        return this.getAverage().compareTo(o.getAverage());
//    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
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
}
