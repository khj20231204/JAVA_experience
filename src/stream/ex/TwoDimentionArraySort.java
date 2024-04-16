package stream.ex;
import java.util.*;
public class TwoDimentionArraySort {

   public void twoDimentionArraySortSolution(){
      int[][] person = {{34,173},{28, 182},{30, 171}};

      //sorted
      ////sorted(람다식)
      Arrays.stream(person).sorted((i1, i2) -> i1[0] - i2[0]).forEach(s -> System.out.println(s[0]));
      ////sorted(Comparator.comparing(변수)) - reversed 불가
      Arrays.stream(person).sorted(Comparator.comparing(i -> i[1])).forEach(s -> System.out.println(s[1]));

      //filter
      Arrays.stream(person).filter(i -> i[0] > 30).forEach(s -> System.out.println(s[0]));

      //toArray
      int[][] person2 = Arrays.stream(person).toArray(int[][]::new);
   }
}