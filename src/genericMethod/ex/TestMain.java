package genericMethod.ex;

public class TestMain {
    public static void main(String[] args){
        //GenericTypeVal
        GenericTypeVal<Long, Double, String> gtv = new GenericTypeVal<>(11l,22d);
        //여기에서 A,B,C 타입 설정 , 초기화는 A,B 타입만 해당
        System.out.println(gtv.toString());

        gtv.setC("type String");
        System.out.println(gtv.getC());

        GenericTypeVal.func("anonymous");
        GenericTypeVal.func(345);

        //GenericMethod
        Point<Integer, Double> p1 = new Point<>(2,8.6);
        Point<Integer, Double> p2 = new Point<>(7,2.3);

        GenericMethod gm = new GenericMethod();
        double result = gm.<Integer, Double>makeRectangle(p1, p2);
        System.out.println(result);

        double result2 = GenericMethod.<Integer, Double>staticMakeRectangle(p1, p2);
        System.out.println(result2);
    }
}

