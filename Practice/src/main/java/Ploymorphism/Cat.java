package Ploymorphism;
public class Cat extends Animal implements Mew{

    String animalVariable = "CatVariable";

    @Override
    public void eat() {
        System.out.println("Cat is eating rat");
    }

    @Override
    public void meow() {
        System.out.println("Meowing");
    }
}