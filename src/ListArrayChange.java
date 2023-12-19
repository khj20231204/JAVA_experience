import java.util.*;
import java.util.stream.*;

public class ListArrayChange {
    public void ListArrayChangeFunc() {

        //1.List -> Array

        List<Integer> listInteger = new ArrayList<>();
        List<String> listStr = new ArrayList<>();

        ////Object[]
        Integer[] arrInteger1 = listInteger.toArray(new Integer[listInteger.size()]);
        String[] arrStr = listStr.toArray(new String[listStr.size()]);

        ////primitive type[] : stream의 mapToInt(Integer::intValue)이용 Integer를 int로 변환
        int[] arrInt = listInteger.stream().mapToInt(Integer::intValue).toArray();
        double[] arrDoublc = listInteger.stream().mapToDouble(Integer::doubleValue).toArray();
        long[] arrLong = listInteger.stream().mapToLong(Integer::longValue).toArray();

        //2.Array -> List

        ////object[] -> List
        Integer[] arrInteger2 = new Integer[10];
        List<Integer> listInteger2 = Arrays.asList(arrInteger2);
        String[] arrStr2 = new String[10];
        List<String> listStr2 = Arrays.asList(arrStr2);

        ////primitive type[] -> List
        int[] arrInt2 = new int[10];
        List<Integer> listInteger3 = Arrays.stream(arrInt2).boxed().collect(Collectors.toList());
        listInteger3 = IntStream.of(arrInt2).boxed().collect(Collectors.toList());

        double[] arrDouble2 = new double[10];
        List<Double> listDouble2 = Arrays.stream(arrDouble2).boxed().collect(Collectors.toList());
        listDouble2 = DoubleStream.of(arrDouble2).boxed().collect(Collectors.toList());

        long[] arrLong2 = new long[10];
        List<Long> listLong2 = Arrays.stream(arrLong2).boxed().collect(Collectors.toList());
        listLong2 = LongStream.of(arrLong2).boxed().collect(Collectors.toList());
    }
}


