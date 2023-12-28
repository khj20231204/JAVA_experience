package classApi.ex;

import javax.naming.ldap.Control;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {

        Class forname_val2 = Class.forName("classApi.ex.ClassExample");
        Class class_val2 = ClassExample.class;
        ClassExample ce = new ClassExample();
        Class getClass_val2 = ce.getClass();

        String result2 =
            " forname_val2:" + forname_val2 +
            ", \n class_val2:" + class_val2 +
            ", \n getClass_val2:" + getClass_val2;

        System.out.println(result2);

        Constructor[] cons = forname_val2.getConstructors();  //생성자
        for(Constructor c :  cons){
            System.out.println(c);
        }

        Method[] mth = forname_val2.getMethods();  //메소드
        for(Method m : mth){
            System.out.println(m);
        }

        //create instacne for basic construct
        Class makeClass1 = Class.forName("classApi.ex.ClassExample");
        ClassExample makeObj1 = (ClassExample) makeClass1.newInstance();

        //create instacne for string construct
        Class makeClass3 = Class.forName("classApi.ex.ClassExample");
        Constructor con3 = makeClass3.getDeclaredConstructor(new Class[]{String.class});
        ClassExample makeObj3 = (ClassExample)con3.newInstance("String Parameter");
    }
}
