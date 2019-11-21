package Ploymorphism;

import java.util.ArrayList;
import java.util.List;

public class WithLists {

    public static void main(String... args) {
        ArrayList<Animal> animal = new ArrayList<Animal>();
        animal.add(new Animal());
        animal.add(new Dog());

        ArrayList<Dog> dogArrayList = new ArrayList<Dog>();
        dogArrayList.add(new Dog());
        dogArrayList.add(new Dog());

        //animal.add(dogArrayList);

    }
}