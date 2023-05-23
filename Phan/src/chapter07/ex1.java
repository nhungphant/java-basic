package chapter07;

import java.util.HashSet;
import java.util.Set;

public class ex1 {
    public static void main(String[] args) {
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();
        s1.add(1);
        s1.add(5);
        s1.add(3);
        s1.add(3);
        s2.add(3);
        s2.add(1);
        s2.add(6);
        s2.add(9);

        System.out.println(s1);
        System.out.println(s2);

        Set<Integer> union = new HashSet<>();
        union.addAll(s1);
        union.addAll(s2);
        System.out.println("Hop cua hai tap hop tren: " + union);

        Set<Integer> intersect = new HashSet<>();
        for (int i = 0; i < s1.size(); i++) {
            if (s2.contains(s1.stream().toList().get(i))) {
                intersect.add(s1.stream().toList().get(i));
            }
        }
        System.out.println("Giao cua hai tap hop tren: " + intersect);
    }
}
