package Practice.LinkedinCollections;

import java.util.ArrayList;

public class clallenge {

    public static void main(String[] args) {

        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();

        arrayList.add("Item1");
        arrayList.add("Item2");
        arrayList.add("Item3");
        arrayList.add("Item4");
        arrayList.add("Item5");

        arrayList2.add("Item6");
        arrayList2.add("Item7");
        arrayList2.add("Item8");
        arrayList2.add("Item9");
        arrayList2.add("Item10");

        arrayList.addAll(arrayList2);

        if (arrayList.contains("Item6")) arrayList.remove("Item6");

        System.out.println(arrayList);





    }
}
