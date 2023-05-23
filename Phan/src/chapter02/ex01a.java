package chapter02;

public class ex01a {
    public static void main(String[] args) {
        int a = 150, b = 525;
        System.out.println("GCD of " + a +" and " + b + " is " + findGCD(a, b));
    }
    //recursive function to return gcd of a and b
    static int findGCD(int a, int b)
    {
        if (b == 0)
            return a;
        return findGCD(b, a % b);
    }
}
