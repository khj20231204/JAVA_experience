package genericMethod.ex;

public class GenericTypeVal <A,B,C> {
    A a;
    B b;
    C c;
    public GenericTypeVal(A a, B b){
        this.a = a;
        this.b = b;
    }
    public void setC(C c){
        this.c = c;
    }
    public C getC(){
        return c;
    }
    public static <R> void func(R r){
        System.out.println("Generic Type - Static Method :"+ r);
    }
    public String toString(){
        return "a="+ a.toString() + " , b=" + b.toString();
    }
}
