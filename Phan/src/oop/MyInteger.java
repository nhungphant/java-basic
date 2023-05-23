package oop;

public class MyInteger {
    private int value;
    boolean greaterThan(MyInteger other){
        return (this.value > other.value);
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
