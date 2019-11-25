package Ploymorphism.StaticAndDynamicBinding.DynamicBinding;

public class Boy extends Human {
    public void walk(){
        System.out.println("Boy walks");
    }

    public static void main(String... args) {
        Human humanObj1 = new Human();
        Human boyObj2 = new Boy();
// Here we are creating objects of Human and Boy.
// Both the Object reference Types are of the parent class.
// method defined in parent class is overriden in the child class. Human(Parent) and Boy(Child).
// When we call the walk method the static methods as per the Reference type are invoked.
// The binging is done late and calls the to the respective methods are done based upon the objects to which they refer.
// The polymorphism.
/* 2. Determining the type of an object at compile time is Static binding whereas determining the type of an object at run time is dynamic binding
3. Java uses static binding for overloaded methods and dynamic binding for overridden methods.*/

        humanObj1.walk();
        boyObj2.walk();
    }
}
