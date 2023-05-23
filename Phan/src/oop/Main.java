package oop;

public class Main {
    public static void main(String[] args) {
//        Foo f = new Foo();
//        Foo f2 = new Foo(1, 2);
//        System.out.println(f.sum());
        MyInteger firstNum = new MyInteger();
        MyInteger secondNum = new MyInteger();
        firstNum.setValue(100);
        secondNum.setValue(999);
        System.out.println(firstNum.greaterThan(secondNum));
    }
}
