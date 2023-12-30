package anonymousObj.ex;

    public class AnonymousObj {
        //필드에서 익명 객체 사용 예
        Person person = new Person(){

            void fieldAnonymousObj(){
                System.out.println("필드에서 익명 객체 사용");
            }

            @Override
            void wake() {
                System.out.println("Wake Up at Seven");
                fieldAnonymousObj();
            }
        };

    //메소드 내부에서 변수로 익명 객체 사용 예
    void methodObj(){
        //익명 객체로 변수 선언
        Person localVar = new Person(){
            void methodAnonymousObj(){
                System.out.println("메소드 내부 변수로 익명 객체 사용");
            }

            @Override
            void wake() {
                System.out.println("Wake Up ad eight");
                methodAnonymousObj();
            }
        };
        localVar.wake();
    }

    //매개변수로 익명 객체 사용 예
    void methodParamObj(Person p){
        p.wake();
    }

}
