public class Cat implements Lion, Tiger {
    public void hunts() {
        System.out.println("Hunts");
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.hunts();
    }
}
