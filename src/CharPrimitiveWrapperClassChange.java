import java.util.*;

public class CharPrimitiveWrapperClassChange {
   public void charPrimitiveWrapperClassChange(){

      /* Character형이 따로 있지만 collection에서 Character대신
      char를 사용할 수 있기 때문에 char와 Character를 변환할 필요가 없다
      선언은 Character로 해도 바로 char를 사용하면 된다. */
      List<Character> listTmp = new ArrayList<>();
      char charTmp = 'd';
      listTmp.add(charTmp);



      /*** char -> Character ***/
      char c1 = 'c';
      //1)바로 대입
      Character ch1 = c1; //char를 바로 대입
      //2)valuOf 이용
      ch1 = Character.valueOf(c1); //valueOf이용

      /*** Character -> char ***/
      //1)valueOf 이용
      Character ch2 = 'c';
      char c2 = Character.valueOf(ch2);

      /*** char[] -> Character[] ***/
      char[] c3 = {'a','b','c'};
      Character[] ch3 = Arrays.stream(c3).mapToObj.toArray(Character[]::new);

      /*** Character[] -> char[] ***/



      //---------------------------------- String -------------------
      /*** char -> String ***/

      /*** Character -> String ***/

      /*** String -> char ***/

      /*** String -> Character ***/

      /*** char[] -> String ***/

      /*** Character[] -> String ***/

      /*** String -> char[] ***/

      /*** String -> Character[] ***/
      String str = "victory";
      Character[] ch5 = str.chars().mapToObj(c -> (char)c).toArray(Character[]::new);   }
}
