package comparable_compare.ex;

import java.util.*;

public class TestMain {
    public static void main(String[] str){

        String[] strArray = new String[]{"r","t","E","B","p","a"};
        for(String s :  strArray){ System.out.print(s); }
        Arrays.sort(strArray);
        System.out.println("\nresult of sort: ");
        for(String s :  strArray){ System.out.print(s); }

        Arrays.sort(strArray, new Desending());
        for(String s :  strArray){ System.out.print(s); }

        Integer[] integerArray = new Integer[]{23,38,2,34,35,6};
        Arrays.sort(integerArray, new Desending());
        for(Integer i : integerArray) System.out.println(i);
    }
}
class Desending implements Comparator{
    @Override
    public int compare(Object o1, Object o2) {
        System.out.println("compare");
        if(o1 instanceof Comparable && o2 instanceof Comparable){
            Comparable c1 = (Comparable) o1;
            Comparable c2 = (Comparable) o2;

            return c1.compareTo(c2) * (-1) ;
        }
        return 0;
    }
}

