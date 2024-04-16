package stream.ex;
import java.util.*;
import java.util.stream.*;
public class SortedEx {

   private class Student{
      String name;
      int ban;
      int totalScore;

      public Student(String n, int b, int t){
         name = n;
         ban = b;
         totalScore = t;
      }

      public String toString(){
         return "name:"+name+" ,ban:"+ban+" ,totalScore:"+totalScore;
      }
   }

   public void solution(){
      List<Integer> list = Arrays.asList(3,456,6,3,21);
      int[] intArr = list.stream().mapToInt(Integer::intValue).toArray();
      List<String> list2 = Arrays.asList("sdf","ege","eetnb");
      String[] strArr = list2.toArray(new String[0]);

      Stream<String> strStream = Stream.of("adf","ppe","aBce");
      strStream.sorted().forEach(System.out::println);
      strStream.sorted(Comparator.naturalOrder());
      strStream.sorted((s1,s2) -> s1.compareTo(s2));
      strStream.sorted(String::compareTo);
      strStream.sorted(Comparator.reverseOrder());
      strStream.sorted(Comparator.<String>naturalOrder().reversed());
      strStream.sorted(Comparator.comparing(String::length));

      //class활용 예제

      /* ban으로 정렬 */
      Stream<Student> studentStream = Stream.of(
            new Student("abc",34,1),
            new Student("etb",4,5),
            new Student("peb",16,3),
            new Student("egh",87,2)
      );
      studentStream.sorted((s1,s2) -> s1.ban - s2.ban).forEach(System.out::println);

      /* name으로 정렬 */
      studentStream = Stream.of(
            new Student("abc",34,1),
            new Student("etb",4,5),
            new Student("peb",16,3),
            new Student("egh",87,2)
      );
      studentStream.sorted((s1,s2) -> s1.name.compareTo(s2.name)).forEach(System.out::println);

      /* ban으로 filter */
      studentStream = Stream.of(
            new Student("abc",34,1),
            new Student("etb",4,5),
            new Student("peb",16,3),
            new Student("egh",87,2)
      );
      studentStream.filter(i -> i.ban > 20).forEach(System.out::println);

      /* totalScore로 filter */
      studentStream = Stream.of(
            new Student("abc",34,1),
            new Student("etb",4,5),
            new Student("peb",16,3),
            new Student("egh",87,2)
      );
      studentStream.filter(i -> i.totalScore > 20).forEach(System.out::println);
   }
}
