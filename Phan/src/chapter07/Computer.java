package chapter07;

public class Computer {
    String name;
    int modelNum;
    public Computer(String name, int modelNum) {
        this.name = name;
        this.modelNum = modelNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getModelNum() {
        return modelNum;
    }

    public void setModelNum(int modelNum) {
        this.modelNum = modelNum;
    }

    public String toString() {
        return "Computer " + name + ": " + "Model " + modelNum + "\n";
    }
}
