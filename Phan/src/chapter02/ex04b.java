package chapter02;

import java.util.ArrayList;
import java.util.List;

public class ex04b {
    public static void main(String[] args) {
        int n = 14;
        List<Integer> res = new ArrayList<>();
        boolean isPrime = true;
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)){
                res.add(i);
            }
        }
        System.out.println(res);
    }
    public static boolean isPrime(int a){
        if (a < 2) {
            return false;
        }
        for (int i = 2; i < a ; i++){
            if (a % i == 0){
                return false;
            }
        }
        return true;
    }
}