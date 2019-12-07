package PracticePrograms;

class TempProgram {
    static void myMethod() throws Exception {
        throw new Exception("error message");
    }

    public static void main(String... args) throws Exception {
        try {
            throw new Exception("error message");
        } catch (Exception e) {
            System.out.println("Adil's try catch " + e.getMessage());
        } finally {
            System.out.println("Adil Finally");
        }
        myMethod();
    }
}