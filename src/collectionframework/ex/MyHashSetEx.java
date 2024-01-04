package collectionframework.ex;

import java.util.HashSet;
import java.util.Set;

public class MyHashSetEx {

    public static void solution(){

        Set<String> hsString = new HashSet<>();
        hsString.add("a");
        hsString.add("b");
        hsString.add("b");
        hsString.add("c");

        System.out.println(hsString);  //[a, b, c]

        HashSet<Integer> hsInteger = new HashSet<>();
        hsInteger.add(34);
        hsInteger.add(45);
        hsInteger.add(45);
        hsInteger.add(15);

        System.out.println(hsInteger); //[34, 45, 15]

    }
}
