package Ploymorphism;
public class Cat extends Animal implements Mew{

    String animalVariable = "CatVariable";

    public void eat() {
        System.out.println("Cat is eating rat");
    }

    public void meow() {
        System.out.println("Meowing");
    }
}