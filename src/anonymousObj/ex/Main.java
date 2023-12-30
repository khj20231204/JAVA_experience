package anonymousObj.ex;

public class Main {
    public static void main(String[] args){

        AnonymousObj ao = new AnonymousObj();
        ao.person.wake(); //ao객체 안에 person필드에서 정의된 wake메소드

        ao.methodObj();

        //매개변수로 전달할 익명 객체
        ao.methodParamObj(new Person(){
                void paramAnonymousObj(){
                    System.out.println("매개변수로 전달되는 익명 객체");
                }
                @Override
                void wake() {
                    System.out.println("Wake Up at nine");
                    paramAnonymousObj();
                }
            }
        );
    }
}
