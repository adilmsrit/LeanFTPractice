import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

public class Demo {

    private static Demo demo = null;

    private Demo() {
    }

    public static Demo checkAndReturnObject() {
        if (demo == null) {
            demo = new Demo();
            System.out.println("Create new Object");
        }
        System.out.println("Returned Object");
        return demo;
    }

    public static void main(String... args) {
//        int i = 5;
//        System.out.println(++i);
//        System.out.println(i++);
//    }
//    @Test(expected = NullPointerException.class)
//    public void testMethod(){
//    }

        List<String> stringList = Arrays.asList("1", "2", "3");
        List<Integer> integerList = stringList.stream()
                .map(x -> Integer.valueOf(x))
                .collect(Collectors.toList());

        System.out.println(integerList);
        int i = 5;
        System.out.println(++i);
        System.out.println(i++);

        Map hashMap = new HashMap();
        hashMap = Collections.synchronizedMap(hashMap);

        ConcurrentHashMap<String, String> concurrentHashMap = new ConcurrentHashMap<String, String>();
        ConcurrentHashMap concurrentHashMap1 = new ConcurrentHashMap();

        Thread thread = new Thread();
        thread.start();

        String name = null;
        int l = name.length();
    }
}