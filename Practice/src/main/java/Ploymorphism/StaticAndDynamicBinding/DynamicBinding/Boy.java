package Ploymorphism.StaticAndDynamicBinding.DynamicBinding;

public class Boy extends Human {
    public static void walk(){
        System.out.println("Boy walks");
    }

    public static void main(String... args) {
        Human humanObj1 = new Human();
        Human boyObj2 = new Boy();

        humanObj1.walk();
        boyObj2.walk();

    }


}
