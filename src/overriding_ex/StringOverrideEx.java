package overriding_ex;

public class StringOverrideEx {
    class MyData implements Comparable{
        String str;

        MyData(String str){
            this.str = str;
        }

        public int compareTo(Object obj){
            System.out.println("this.str:"+this.str);
            String s="";
            if(obj instanceof MyData) s = ((MyData)obj).str;
            System.out.println("obj:"+s);

            return 1;
        }
    }

    public int solution(String s1, String s2){

        MyData md1 = new MyData(s1);
        MyData md2 = new MyData(s2);

        int a = md1.compareTo(md2);

        return 0;
    }
}
