package OCA;

public class Exceptions {
    public static void main(String... args) {
        Exceptions e = new Exceptions();
        e.explore();
    }

    void explore() {
        try {
            fall();
            System.out.println("never get here");

        } catch (RuntimeException e) {
            getUp();
        }
        seeAnimals();
    }

    void getUp() {
        System.out.println("Get up");
    }

    void seeAnimals() {
        System.out.println("See Animals");

    }

    void fall() {
        throw new RuntimeException();
    }
}
