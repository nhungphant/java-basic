package chapter09;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AnimalTest {
    public static void main(String[] args) {
        List<Animal> animalList = new ArrayList<Animal>();

        Dog d1 = new Dog();
        d1.setName("Corgi");
        d1.setSpeed(10);
        animalList.add(d1);

        Dog d2 = new Dog();
        d2.setName("Chihuahua");
        d2.setSpeed(5);
        animalList.add(d2);

        Dog d3 = new Dog();
        d3.setName("Puddle");
        d3.setSpeed(7);
        animalList.add(d3);

        Dog d4 = new Dog();
        d4.setName("Golden Retriever");
        d4.setSpeed(12);
        animalList.add(d4);

        Animal d5 = new Dog();
        d5.setName("Bergie");
        d5.setSpeed(15);
        animalList.add(d5);

        List<Animal> sortedList = animalList.stream().sorted(Comparator.comparingInt(Animal::getSpeed)).toList();
//        System.out.println(sortedList);

        int count = 1;
        // sao Dog dog:sortList không được nhỉ?
        for (Animal animal:sortedList) {
            System.out.print(count + ": ");
            animal.print();
            System.out.print(", ");
            animal.run();
            System.out.print("\n");
            count++;
        }
    }
}
