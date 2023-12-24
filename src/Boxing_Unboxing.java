public class Boxing_Unboxing {
    public void solution(){
/*
        -- 사장된 문법 --
        Byte b1 = new Byte(10);
        Byte b2 = new Byte("10");

        Short s1 = new Short(10);
        Short s2 = new Short("10");

        Integer i11 = new Integer(100);
        Integer i21= new Integer("100");

        Long l11 = new Long(100);
        Long l21 = new Long("100");

        Float f1 = new Float(10.0);
        Float f2 = new Float(10.0f);
        Float f3 = new Float("10.0");

        Double d1 = new Double(1.0);
        Double d2 = new Double("1.0");

        Character c = new Character('a');
*/
        //Boxing
        Byte b1_fix = 10;
        Byte b2_fix = Byte.valueOf("10");

        Short s1_fix = 10;
        Short s2_fix = Short.valueOf("10");

        Integer i1_fix = 100;
        Integer i2_fix = Integer.valueOf("100");

        Long l1_fix = 100l;
        Long l2_fix = Long.valueOf("100l");

        Float f1_fix = 10.0f;
        Float f2_fix = Float.valueOf("10.0f");

        Double d1_fix = 1000d;
        Double d2_fix = Double.valueOf("1000d");

        Character c_fix = 'c';
        Character c2_fix = Character.valueOf('c');

        //Unboxing
        byte b = b2_fix.byteValue();
        short s = s2_fix.shortValue();
        int i = b2_fix.intValue();
        long l = l2_fix.longValue();
        float f = f2_fix.floatValue();
        double d = d2_fix.doubleValue();
        char c = c2_fix.charValue();

        //문자열을 기본 타입으로
        byte bp = Byte.parseByte("100");
        Short sp = Short.parseShort("100");
        int ip = Integer.parseInt("100");
        long lp = Long.parseLong("100");
        float fp = Float.parseFloat("100");
        double dp = Double.parseDouble("100");

        //idx example
        int idx_i1 = Integer.parseInt("100",2); //4
        int idx_i2 = Integer.parseInt("100",8); //64
        int idx_i3 = Integer.parseInt("100",16); //256

        Integer idx_i4 = Integer.valueOf("100",2); //4
        Integer idx_i5 = Integer.valueOf("100",8); //64
        Integer idx_i6 = Integer.valueOf("100",16); //256

    }
}
