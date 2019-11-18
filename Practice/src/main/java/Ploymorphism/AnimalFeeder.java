package Ploymorphism;

import java.util.ArrayList;
import java.util.List;

public class AnimalFeeder {

    public static void main(String... args) {
        Animal animal = new Cat();
        animal.eat(); // Will fetch only Cat methods and nothing from Animal class.
        ((Cat) animal).meow(); //To Access the Cat methods.

// Even though animal is assigned to Cat object, the variable is fetched of Animal class
        System.out.println(animal.animalVariable);

        System.out.println("*********************************************************************************");

        List<Animal> animals = new ArrayList<Animal>();
        animals.add(new Cat());
        animals.add(new Dog());
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        new AnimalFeeder().feed(animals);
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");


        //Below is an Interface
        Mew mew = new Cat();
        mew.meow();
        //To make mew obj access Cat class methods, we need to upcast the subclass obj mew to
        // Cat parent class and then access the
        ((Cat)mew).eat();

    }

    public void feed(List<Animal> animals) {
        animals.forEach(animal -> {
            if (animal instanceof Cat){
                //Casting example
                ((Cat)animal).meow();
            }
            animal.eat();
        });
    }
}