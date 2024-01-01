package staticMemberUse.ex;

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
