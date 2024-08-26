package staticMemberUse.ex;

//인스턴스 메소드에서 static 변수 사용
//static메소드에서 일반 변수 사용

//인스턴스 메소드 내에 일반변수 호출 가능
//인스턴스 메소드 내에 static변수 호출 가능

//static 메소드에 일반변수 호출 가능
//static 메소드에 static변수 호출 가능


public class StaticMember {
    int instanceMember;
    static int staticMember = 11;
    public void instanceMethod(int param){
        System.out.println("instanceMethod");
        System.out.println("staticMember:"+staticMember);
        this.instanceMember = param;

        staticMethod(33);
    }
    public static void staticMethod(int param){

        System.out.println("staticMethod");

        System.out.println("staticMember:"+staticMember);
        //instanceMember = param;  error발생

        //instanceMethod(44);  error발생
        StaticMember sm = new StaticMember();

        sm.instanceMember = param;
        sm.instanceMethod(44);
    }
    static class StaticClass{

        StaticClass(){

        }
    }
}
