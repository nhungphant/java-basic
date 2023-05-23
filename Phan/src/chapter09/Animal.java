package chapter09;

public class Animal {
    String name;
    int speed;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void run() {
        System.out.print("Toc do = " + speed + "km/h");
    }

    public void print() {
        System.out.print("Ten = " + name);
    }

    public String toString() {
        return "{Animal" + "Ten = " + name + ", " + "Toc do: " + speed + "km/h}";
    }
}
