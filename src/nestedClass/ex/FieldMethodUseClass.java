package nestedClass.ex;

public class FieldMethodUseClass {
    //필드나 메소드에서 클래스를 사용시 주의 점
    class InstanceClass{}
    static class MyStaticClass{ }
    InstanceClass uc = new InstanceClass();
    MyStaticClass sc = new MyStaticClass();
    void instanceMethod(){
        InstanceClass uc = new InstanceClass();
        MyStaticClass sc = new MyStaticClass();
    }
    static void staticMethod(){
        //InstanceClass uc = new InstanceClass();  error
        MyStaticClass sc = new MyStaticClass();
    }
}
