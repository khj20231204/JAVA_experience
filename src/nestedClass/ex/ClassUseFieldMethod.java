package nestedClass.ex;

public class ClassUseFieldMethod {
    int myfield;
    static int staticFiled;
    public void instanceMethod(){}
    public static void staticMethod(){}
    class instanceClass{
        void method(){
            myfield = 10;
            staticFiled = 11;

            instanceMethod();
            staticMethod();
        }
    }
    static class MyStaticClass{
        void method(){
            //myfield = 10;  error
            staticFiled = 11;

            //instanceMethod();  error
            staticMethod();
        }
    }
}
