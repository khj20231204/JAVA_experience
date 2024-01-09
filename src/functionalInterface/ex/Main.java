package functionalInterface.ex;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        FunctionalInterface fi = new FunctionalInterface() {
            @Override
            public int methodOfLamda(int a, int b) {
                return a * b;
            }
        };

        FunctionalInterface fi2 = (a, b) -> a * b;

        List<String> list1 = Arrays.asList("c","a","d","e");
        list1.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2) * (-1);
            }
        });

        list1.sort((o1, o2)-> o1.compareTo(o2)*(-1));

        list1.stream().forEach(System.out::println);
    }
}
