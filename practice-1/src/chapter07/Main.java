package chapter07;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Computer c1 = new Computer("A", 1);
        Computer c2 = new Computer("B", 3);
        List<Computer> computerList = new ArrayList<>();
        computerList.add(c1);
        computerList.add(c2);
        System.out.println(computerList);
    }
}
