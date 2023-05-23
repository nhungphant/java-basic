package chapter07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ex2 {
    public static void main(String[] args) {
        List<String> A = new ArrayList<>();
        List<String> B = new ArrayList<>();
        A.add("pig");
        A.add("cat");
        A.add("dog");
        B.add("rose");
        B.add("sunflower");
        B.add("jasmine");
        System.out.println(A);
        System.out.println(B);

//        for (int i = 0; i < A.size(); i++) {
//            Collections.replaceAll(A, A.get(i), A.get(i).toUpperCase());
//        }
//        System.out.println(A);
//
//        for (int i = 0; i < B.size(); i++) {
//            Collections.replaceAll(B, B.get(i), B.get(i).toUpperCase());
//        }
//        System.out.println(B);
        List<String> newA = new ArrayList<String>();
        newA = A.stream().map(String::toUpperCase).toList();
        System.out.println(newA);

        List<String> join = new ArrayList<String>();
        join.addAll(A);
        join.addAll(B);
        System.out.println(join);
        join.remove((int) (join.size() - 1) / 2);
        System.out.println(join);
    }
}
