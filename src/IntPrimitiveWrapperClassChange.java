import java.util.*;

public class IntPrimitiveWrapperClassChange {
    public void intPrimitiveWrapperClassChangeFunc() {

        /* valueOf는 primitive <-> wrapperClass사이에 전부 사용 가능 */

        /*** int -> Integer ***/
        //1)valueOf 이용
        int intA = 34;
        Integer integerA = Integer.valueOf(intA); //Integer.valueOf이용
         /* valueOf는 모든 wrapperClass에 전부 있다
        Byte.valueOf()
        Integer.valueOf()
        Short.valueOf()
        Float.valueOf()
        Long.valueOf()
        Double.valueOf() */

        /*** Integer -> int ***/
        //1)valueOf 이용
        Integer integerB = 76;
        int intB = Integer.valueOf(integerB);

        //2)intValue 이용
        int intC = integerB.intValue();
        /*
        Integer i = 23;
        i.byteValue();
        i.intValue();
        i.longValue();
        i.doubleValue();
        i.floatValue();
        i.shortValue();
        */

        /*** int[] -> Integer[] ***/
        int[] intD = {1,2,3,4};
        Integer[] integerD = Arrays.stream(intD).boxed().toArray(Integer[]::new);

        /*** Integer[] -> int[] ***/
        //1)mapToInt(Integer::intValue)이용
        Integer[] integerE = {1,2,3,4};
        int[] intE = Arrays.stream(integerE).mapToInt(Integer::intValue).toArray();

        //2)mapToInt(i->i)이용
        intE = Arrays.stream(integerE).mapToInt(i->(int)i).toArray();

        /*** int[] -> List ***/

        /*** Integr[] -> List ***/

        /*** List -> int[] ***/

        /*** List -> Integer[] ***/
    }

}
