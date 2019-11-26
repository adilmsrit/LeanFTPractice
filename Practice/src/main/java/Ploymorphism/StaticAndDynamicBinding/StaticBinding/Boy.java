package Ploymorphism.StaticAndDynamicBinding.StaticBinding;

public class Boy extends Human {
    public static void walk(){
        System.out.println("Boy walks");
    }

    public static void main(String... args) {
        Human humanObj1 = new Human();
        Human boyObj2 = new Boy();
// Here we are creating objects of Human and Boy.
// Both the Object reference Types are of the parent class.
// Static methods of walk are defined both in Human(Parent) and Boy(Child).
// When we call the walk method the static methods as per the Reference type are invoked.
        humanObj1.walk();
        boyObj2.walk();

    }


}
