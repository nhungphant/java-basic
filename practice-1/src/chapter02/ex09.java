package chapter02;

import java.util.*;

public class ex09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap xau ky tu bat ky: ");
        String temp = sc.nextLine();
        temp = temp.trim().replaceAll("\\s+", " ");

        Map<String, Integer> treeMap = new HashMap<>();
        List<String> listWords = Arrays.stream(temp.split(" ")).toList();
        System.out.println(listWords);
        for (int i = 0; i < listWords.size(); i++) {
            addElement(treeMap, listWords.get(i));
        }
        System.out.println(treeMap);
    }
    private static void addElement(Map<String, Integer> map, String key){
        if (map.containsKey(key)){
            map.put(key, map.get(key) + 1);
        } else {
            map.put(key, 1);
        }
    }
}
