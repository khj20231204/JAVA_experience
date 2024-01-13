

package polymorphism.ex;

public class TestMain {
    public static void main(String[] args){
        // A class
        PolyMain pm = new PolyMain();
        pm.a_obj.A_Func();

        pm.check(new A());

        //B class
        B b = new B();
        pm.a_obj = b;  //a객체에 b객체 대입
        pm.a_obj.A_Func();  //b객체의 메서드가 대신 호출

        pm.check(b);

        B b_typeCh = (B)b;  //강제타입 변환
        b_typeCh.B_Func();  //B클래스에 있는 메서드 사용 가능

        System.out.println(b instanceof B);
        System.out.println(b instanceof A);
    }
}
