package functionalInterface.ex;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //구현 객체
        FunctionalInterface fi = new FunctionalInterface() {
            @Override
            public int methodOfLamda(int a, int b) {
                return a * b;
            }
        };

        //람다식으로 표현
        FunctionalInterface fi2 = (a, b) -> a * b;

        //Comparator를 람다식으로 표현
        List<String> list1 = Arrays.asList("c","a","d","e");
        list1.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2) * (-1);
            }
        });

        list1.sort((o1, o2)-> o1.compareTo(o2)*(-1));

        list1.stream().forEach(System.out::println);

        //매개변수로 함수형 인터페이스를 사용
        FunctionalInterface fiPlus = (int a, int b) -> a+b;

        int x = 6, y = 3;

        int result = functionalMethod(fiPlus,x,y); //매개변수로 함수형 인터페이스 참조변수를 할당
        System.out.println("result:"+result);

        result = functionalMethod((int a, int b) -> a - b, x, y); //매개변수로 람다식 할당
        System.out.println("result:"+result);

        //리턴값으로 함수형 인터페이스를 사용
        FunctionalInterface fi3 = returnFI();
        fi3.methodOfLamda(9,4);
    }

    static int functionalMethod(FunctionalInterface fi, int x, int y){
        return fi.methodOfLamda(x,y);
    }

    static FunctionalInterface returnFI(){

        return (int a, int b) -> a-b;
    }
}
