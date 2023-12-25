import java.nio.charset.StandardCharsets;
import java.text.StringCharacterIterator;

public class StringApi {

    public void solution(){
        byte[] byteData = {98,121,116,101,68,97,116,97};  //아스키코드

        String str1 = new String(byteData);
        System.out.println(str1);
        String str2 = new String(byteData, StandardCharsets.UTF_8);
        System.out.println(str2);
        String str3 = new String(byteData, StandardCharsets.UTF_16);
        System.out.println(str3);
        String str4 = new String(byteData,0,4);
        System.out.println(str4);

        String str = "byteData";
        System.out.println(str.charAt(0));

        byte[] strByte = str.getBytes();
        for(byte i : strByte){
            System.out.println(i);
        }

        String str25 = new String(strByte);
        System.out.println(str25);
    }
}
