package nestedClass.ex;

public class A {

    public A(){
        System.out.println("A constructor");
    }

    class B{
        B(){
            System.out.println("B constructor");
        }

        int i;
        static int j;
        void method(){
            System.out.println("B class's method");
        }
        static void method2(){
            System.out.println("B class static method2");
        }
    }

    static class C{
        C(){
            System.out.println("static C constructor");
        }

        int i;
        static int j;
        void method(){
            System.out.println("C class's method");
        }
        static void method2(){
            System.out.println("C class static method2");
        }
    }

    void methodA(){
        class D{
            D(){
                System.out.println("D constructor");
            }
            int i;
            static int j;
            void method(){
                System.out.println("D class's method");
            }
            static void method2(){
                System.out.println("D class static method2");
            }
        }

        D d = new D();  //D constructor
        d.i = 55;
        D.j = 66;
        d.method();  //D class's method
        D.method2();  //D class static method2
    }

    static void staticMethodA(){
        class E{
            E(){
                System.out.println("E constructor");
            }
            int i;
            static int j;
            void method(){
                System.out.println("E class's method");
            }
            static void method2(){
                System.out.println("E class static method2");
            }
        }

        E e = new E();  //E constructor
        e.i = 77;
        E.j = 88;
        e.method();  //E class's method
        E.method2();  //E class static method2
    }

    void useAClass(){
        C c = new C();
    }
}
