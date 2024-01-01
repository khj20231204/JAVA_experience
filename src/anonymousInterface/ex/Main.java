package anonymousInterface.ex;

public class Main {
    public static void main(String[] str){
        Anonymous anony = new Anonymous();
        anony.rcField.turnOn();
        anony.rcField.turnOff();

        anony.method();


        RemoteControl rc = new RemoteControl() {
            @Override
            public void turnOn() {
                System.out.println("Main On");
            }

            @Override
            public void turnOff() {
                System.out.println("Main Off");
            }
        };

        rc.turnOff();
        anony.method2(rc);
    }
}
