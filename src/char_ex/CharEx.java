package char_ex;

import java.util.*;

public class CharEx {
    public static void charEx(){

        /*** char 대소문자 ***/
        //대문자->소문자
        char charUpper = 'A';
        char cL1 = Character.toLowerCase(charUpper);
        char cL2 = 'A'+32;
        char cL3 = (char)(charUpper+32);

        if(Character.isUpperCase(charUpper)) System.out.println("c1은 대문자");
        if(charUpper>=65 && charUpper<=90) System.out.println("c1은 대문자");

        //소문자->대문자
        char charLower = 'a';
        char cU1 = Character.toUpperCase(charLower);
        char cU2 = 'a'-32;
        char cU3 = (char) (charLower-32);

        if(Character.isLowerCase(charLower)) System.out.println("c2는 소문자");
        if(charLower>=90 && charLower<=122) System.out.println("c2는 소문자");

        /*** String와 char ***/
        String str = "strings";

        //String -> char[]
        char[] charArray = str.toCharArray();
        char charOne = str.charAt(2); // 'r'
        int charIdx = str.indexOf('r'); // 2

        //char -> String
        String charString = Character.toString(charOne);
        String charString2 = String.valueOf(charOne);

        //char[] -> String
        String charArrayString = String.valueOf(charArray);

        /*** char숫자를 int형으로 ***/
        char charNumber = '7';

        //Character.getNumbericValue
        int charInt = Character.getNumericValue(charNumber);

        //아스키코드 이용
        int charInt2 = charNumber - '0';

        /*** int형 숫자를 char 숫자로 ***/
        //아스키코드 이용
        char charNumber2 = (char)(charInt2+'0');
    }
}
