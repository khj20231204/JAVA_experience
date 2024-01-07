package iterator.ex;

import java.util.*;

public class IteratorEx {
    public static void solution(){
        //Set
        Set<String> setIter = new HashSet<>();
        setIter.add("c");
        setIter.add("f");
        setIter.add("a");
        setIter.add("b");

        Iterator iterator = setIter.iterator();
        while ((iterator.hasNext())) {
            Object o = iterator.next();
            System.out.print(o.toString());
        }

        System.out.println("\n -----------");

        iterator = setIter.iterator();
        while ((iterator.hasNext())) {
            Object o = iterator.next();
            if(o.toString().equals("b")) iterator.remove();
        }

        iterator = setIter.iterator();
        while ((iterator.hasNext())){
            Object o = iterator.next();
            System.out.print(o.toString());
        }

        System.out.println("\n ===========");

        //List
        List<String> list = new ArrayList<>();
        list.add("c");
        list.add("f");
        list.add("a");
        list.add("b");

        System.out.println("\n -----------");

        Iterator listIter = list.iterator();
        while ((listIter.hasNext())){
            Object o = listIter.next();
            System.out.print(o.toString());
        }
    }
}
