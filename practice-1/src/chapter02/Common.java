package chapter02;

public class Common {
    public static int sum(int n) {
        int sum = 0;
        while (n != 0) {
            sum = sum + n % 10;
            n = n / 10;
        }
        return sum;
    }

    public static boolean isPrime(int m) {
        if (m <= 1) {
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt(m); i++) {
                if (m % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
