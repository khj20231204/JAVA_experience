package stream.ex;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TestMain {
    public static void main(String[] args){
        StreamBaseEx sbe = new StreamBaseEx();
        //sbe.solution();

        SortedEx se = new SortedEx();
        //se.solution();

        ClassSort cs = new ClassSort();
        cs.classSortSolution();

        Stream<Student> studentStream = Stream.of(
              new Student("abbe",3,300),
              new Student("dfeg",4,124),
              new Student("sdfge",56,436),
              new Student("oegwe",6,924)
        );

        //studentStream.sorted(Comparator.comparing(Student::getBan)).forEach(System.out::println);

        Stream<Student2> student2Stream = Stream.of(
              new Student2("bedb",3,4664),
              new Student2("egre",34,3256),
              new Student2("wrc",93,5436)
        );

        //student2Stream.sorted(Comparator.comparing(Student2::getTotalScore)).forEach(System.out::println);
    }
}
