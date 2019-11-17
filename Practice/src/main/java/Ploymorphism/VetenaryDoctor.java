package Ploymorphism;

public class VetenaryDoctor {

    public static void main(String... args) {
        Animal animal = new Cat();
        animal.eat(); // Will fetch only Cat methods and nothing from Animal class.
        ((Cat) animal).meow(); //To Access the Cat methods.

// Even though animal is assigned to Cat object, the variable is fetched of Animal class
        System.out.println(animal.animalVariable);
    }
}