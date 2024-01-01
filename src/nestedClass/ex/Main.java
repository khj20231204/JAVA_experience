package nestedClass.ex;

public class Main {
    public static void main(String[] str){
        //A class
        A a = new A();  //A constructor

        //instance B class
        A.B b = a.new B();  //B constructor
        b.i = 11;
        A.B.j = 22;
        b.method();  //B class's method
        A.B.method2();  //B class static method2

        //static C class
        A.C c = new A.C();  //static C constructor
        c.i = 33;
        A.C.j = 44;
        c.method();  //C class's method
        A.C.method2(); //C class static method2

        //D class
        a.methodA();

        //E class
        A.staticMethodA();


    }
}
