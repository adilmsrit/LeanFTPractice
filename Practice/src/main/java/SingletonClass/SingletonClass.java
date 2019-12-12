package SingletonClass;

public class SingletonClass {
    //Static Class Reference
    private static SingletonClass obj = null;

    private SingletonClass() {
        /*Private Constructor will prevent
         * the instantiation of this class directly*/
    }

    public static SingletonClass objectCreationMethod() {
        /*This logic will ensure that no more than
         * one object can be created at a time */
        if (obj == null) {
            obj = new SingletonClass();
            System.out.println("New Object is now created.");
        }
        System.out.println("Return the object created.");
        return obj;
    }

    public static void main(String... args) {
        //Object cannot be created directly due to private constructor
        //This way it is forced to create object via our method where
        //we have logic for only one object creation
        SingletonClass myobject1 = SingletonClass.objectCreationMethod();
        // The second time you try to create the object the same Object is returned.
        SingletonClass myobject2 = SingletonClass.objectCreationMethod();
    }
}