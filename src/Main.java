public class Main {
    public static void main(String[] args) {
        Ex_List el = new Ex_List();
        //el.explain();

        ArrayApi arry = new ArrayApi();
        //arry.solution();

        Java_lang_object_override oe = new Java_lang_object_override("abcd");
        Java_lang_object_override oe1 = new Java_lang_object_override("abcde");
        //System.out.println(oe.equals(oe1));

        //equals 체크
        String str1 = new String("abc");
        String str2 = new String("abc");
        String str3 = "abc";
/*
        System.out.println(str1.equals(str2)); //true
        System.out.println(str1 == str2); //false
        System.out.println(str1.equals(str3)); //true
        System.out.println(str1 == str3); //false
*/
        Integer val1 = 300;
        Integer val2 = 300;

        System.out.println("a:"+(val1 == val2));  //false
        System.out.println(val1.equals(val2));  //true

        StringApi sa = new StringApi();
        //sa.solution();
    }
}