package chapter05;

import java.util.*;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so phan tu cua day: ");
        int n = sc.nextInt();
        while (n < 1) {
            System.out.println("Nhap lai: ");
            n = sc.nextInt();
        }
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap vao phan tu thu " + (i + 1));
            a[i] = sc.nextInt();
        }
        System.out.println("Day a vua nhap: " + Arrays.toString(a));

        List<Integer> sqrNum = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= a[i]; j++) {
                if (j * j == a[i]) {
                    sqrNum.add(a[i]);
                }
            }
        }
        System.out.println("Danh sach cac so chinh phuong thuoc day a: " + sqrNum);

        int[] b = new int[n];
        b[0] = a[0];
        for (int i = 1; i < n; i++) {
            b[i] = a[i] + a[i - 1];
        }
        System.out.println("Day b: " + Arrays.toString(b));

        Arrays.sort(a);
        int[] c = new int[n];
        int j = 0;
        for (int i = n-1 ; i >= 0 ; i--) {
            c[j] = a[i];
            j++;
        }
        System.out.println("Day a theo thu tu giam dan: " + Arrays.toString(c));
    }
}
