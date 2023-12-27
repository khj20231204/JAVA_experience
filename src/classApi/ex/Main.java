package classApi.ex;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        Class forname_val = Class.forName("java.lang.String");
        Class class_val = String.class;
        String s = "string";
        Class getClass_val = s.getClass();

        String result =
            " forname_val:" + forname_val +
            ", class_val:" + class_val+
            ", getClass_val:" + getClass_val;

        System.out.println(result);

        Class forname_val2 = Class.forName("classApi.ex.ClassExample");
        Class class_val2 = ClassExample.class;
        ClassExample ce = new ClassExample();
        Class getClass_val2 = ce.getClass();

        String result2 =
            " forname_val2:" + forname_val2 +
            ", class_val2:" + class_val2 +
            ", getClass_val2:" + getClass_val2;

        System.out.println(result2);
    }
}
