package stream.ex;
import java.util.*;
import java.util.stream.*;
public class SortedEx {
   public class Student{
      String ban;
      String totalScore;

      String getTotalScore(){
         return totalScore;
      }

      public static <String> String getBan(String s) {
         return ban;
      }
   }
   public void solution(){
      List<Integer> list = Arrays.asList(3,456,6,3,21);
      int[] intArr = list.stream().mapToInt(Integer::intValue).toArray();
      List<String> list2 = Arrays.asList("sdf","ege","eetnb");
      String[] strArr = list2.toArray(new String[0]);

      Stream<String> strStream = Stream.of("adf","ppe","aBce");
      strStream.sorted().forEach(System.out::println);
      strStream.sorted();
      strStream.sorted(Comparator.naturalOrder());
      strStream.sorted((s1,s2) -> s1.compareTo(s2));
      strStream.sorted(String::compareTo);
      strStream.sorted(Comparator.reverseOrder());
      strStream.sorted(Comparator.<String>naturalOrder().reversed());
      strStream.sorted(Comparator.comparing(String::length));
      strStream.sorted(Comparator.comparing(Student::getBan));
   }
}
