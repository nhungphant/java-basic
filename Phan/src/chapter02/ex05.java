package chapter02;

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Thu tu so Fibonacci muon tim: ");
        int n = sc.nextInt();
        while (n < 2) {
            System.out.println("Xin vui long nhap gia tri lon hon hoac bang 2: ");
            n = sc.nextInt();
        }
        System.out.println("So Fibonacci can tim la: " + Fibonacci(n));
    }

    static long Fibonacci(int n) {
        long[] Flist = new long[(n+1)];
        Flist[0] = Flist[1] = 1;
        for (int m = 2; m <= n; m++) {
            Flist[m] = Flist[(m-1)] + Flist[(m-2)];
        }
        return Flist[n];
    }
}

