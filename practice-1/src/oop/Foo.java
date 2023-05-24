package oop;

public class Foo {
    int a = 1;
    int b;

    public Foo() {
    }
    public Foo(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public Foo(int b) {
        this.b = b;
    }

    public int sum(){
        return this.a + this.b;
    }
}
