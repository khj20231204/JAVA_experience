import java.util.*;
import java.util.stream.*;

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

      /*** String -> Character[] ***/
      String str = "victory";
      Character[] ch5 = str.chars().mapToObj(c -> (char)c).toArray(Character[]::new);

      //--------------------------- List -----------------------
      /*** char[] -> List ***/
      char[] charArr = {'a','b','w'};
      //1)List<Character>로 변환
      List<Character> charList = IntStream.range(0, charArr.length).mapToObj(i -> charArr[i]).collect(Collectors.toList());
      //IntStream으로 변환 -> mapToObj로 wrapper클래스로 변환 -> collect로 List로 변환
      //2)List<char[]>로 변환
      List<char[]> list = Arrays.asList(charArr);

      /*** List -> char[] ***/
      //반복문으로

      /*** List<Character> -> String ***/
      List<Character> charList2 = new ArrayList<>(Arrays.asList('q','w','p'));
      String strValue = charList2.stream().map(String::valueOf).collect(Collectors.joining());

      //------------------ primitive-wrapper -----------------------
      int a = 4;
      char b = 'c';
      String s = "5";

      /* String <-> int, char */
      String s1 = String.valueOf(a);
      String s2 = String.valueOf(b);

      /* Character <-> char */
      Character cc2 = Character.valueOf(b);
      char ccc2 = Character.valueOf(cc2);

      /* Interger <-> int */
      Integer i = Integer.valueOf(a);
      int i22 = Integer.valueOf(i);
   }
}
