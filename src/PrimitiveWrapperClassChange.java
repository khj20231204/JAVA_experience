import java.util.*;
import java.util.stream.*;

public class PrimitiveWrapperClassChange {
    public void PrimitiveWrapperClassChangeFunc() {

        //1.int <-> Integer

        ////1)int -> Integer - new Integer이용, Integer.valueOf이용
        int int1_1 = 34;
        //new Integer이용 : JDK9버전부터 deprecation되었다. error는 나지 않지만 권장하지 않는 방법이다
        //Integer integer1_1 = new Integer();
        Integer integer1_1 = Integer.valueOf(int1_1); //Integer.valueOf이용
        //Byte.valueOf(), Integer.valueOf(),Short.valueOf(), Float.valueOf(), Long.valueOf(), 	Double.valueOf()

        ////2)Integer -> int
        Integer integer1_2 = 76;
        int int1_2 = integer1_2.intValue();
        /*
        Integer i = 23;
        i.byteValue();
        i.intValue();
        i.longValue();
        i.doubleValue();
        i.floatValue();
        i.shortValue();
        */

        //2.int[] <-> Integer[]

        ////1)int[] -> Integer[]
        int[] int2_1 = {1,2,3,4};
        Integer[] integerA = Arrays.stream(int2_1).boxed().toArray(Integer[]::new);

        ////2)Integer[] -> int[]
        Integer[] integer2_2 = {1,2,3,4};
        int[] int2_2 = Arrays.stream(integer2_2).mapToInt(Integer::intValue).toArray();
        int2_2 = Arrays.stream(integer2_2).mapToInt(i->i).toArray();
    }

}
