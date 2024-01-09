package stream.ex;

import java.lang.reflect.Array;
import java.util.*;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args){
        //list stream
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        Stream<Integer> listStream = list.stream();

        //lamda stream
        Stream<Integer> evenStream = Stream.iterate(0, n->n+2);
        Stream<Double> randomStream = Stream.generate(Math::random);

        System.out.println("----- new stream 1 ----");

        //array stream
        Stream<String> strStream1 = Stream.of(new String[]{"ef","ab","eg","ab","da","de"});
        strStream1.limit(4).sorted().distinct().forEach(System.out::println); //ab ef eg

        System.out.println("----- new stream 2 ----");

        Stream<String> strStream2 = Stream.of(new String[]{"ef","ab","eg","ab","da","de"});
        strStream2.distinct().limit(4).sorted().forEach(System.out::println); //ab da ef eg

        System.out.println("----- new stream 3 ----");

        String[] strArray = new String[]{"ef","ab","eg","ab","da","de"}; //배열 생성
        Stream<String> strStream3 = Stream.of(strArray);  //스트림 생성
        Stream<String> disStream = strStream3.distinct();  //distinct 적용
        Stream<String> limStream = disStream.limit(4); //limit 적용
        Stream<String> sortStream = limStream.sorted(); //sort 적용
        sortStream.forEach(System.out::println); //최종 연산

        //지연된 연산
        IntStream intStream = new Random().ints(1,46);
        intStream.distinct().limit(5).forEach(System.out::println); //37,16,34,5,14
        //intStream.forEach(System.out::println);

        //stream 생성
        Stream<String> strStream4 = Stream.of("a","c" ,"b");
        Stream<String> strStream5 = Stream.of(new String[]{"a","c" ,"b"});
        Stream<String> strStream6 = Arrays.stream(new String[] {"a","c","b"});

        strStream4.forEach(t->System.out.println(t)); //acb
        strStream5.forEach(t->System.out.println(t)); //acb
        strStream6.forEach(t->System.out.println(t)); //acb

    }
}
