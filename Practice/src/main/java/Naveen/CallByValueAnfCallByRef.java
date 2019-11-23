package Naveen;

public class CallByValueAnfCallByRef {
    int p;
    int q;
    public static void main(String... args) {
        CallByValueAnfCallByRef obj = new CallByValueAnfCallByRef();
        int x = 10;
        int y = 20;
        obj.testSum(x, y); // call by value OR pass by value
        obj.p = 50;
        obj.q = 60;

        System.out.println(obj.p);
        System.out.println(obj.q);

        System.out.println("Swapped");
        obj.swap(obj);
        System.out.println("obj.p:: "+obj.p);
        System.out.println("obj.q:: "+obj.q);
    }

    public int testSum(int a, int b) {
        int c = a + b;
        return c;
    }

    // call by reference. Passing the object references. Similar to pointers in C.
    public void swap(CallByValueAnfCallByRef t) {
        int temp;
        temp = t.p; // temp=50
        t.p=t.q; // t.p = 60
        t.q=temp; // t.q = 40
        System.out.println("In the function");
        System.out.println("t.p:: "+t.p);
        System.out.println("t.q:: "+t.q);
    }

}