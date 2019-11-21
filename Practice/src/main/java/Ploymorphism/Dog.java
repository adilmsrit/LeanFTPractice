package Ploymorphism;

import java.util.ArrayList;
import java.util.List;

public class Dog extends Animal{

    public void eat(){
        System.out.println("Dog eats Cat");
    }

    public static void main(String... args) {
        ArrayList<Dog> dogs1 = new ArrayList<Dog>();
        ArrayList<Animal> animals1 = new ArrayList<Animal>();
        List<Animal> list = new ArrayList<Animal>();
        ArrayList<Dog> dogs = new ArrayList<Dog>();     //The book says this line will not compile
        ArrayList<Animal> animals = animals1;
        List<Dog> dogList = dogs;
        ArrayList<Object> objects = new ArrayList<Object>();
        List<Object> ObjList = objects;
        ArrayList<Object> objs = new ArrayList<Object>();
    }

}
