package anonymousInterface.ex;

public class Anonymous {
    RemoteControl rcField = new RemoteControl() {
        @Override
        public void turnOn() {
            System.out.println("TV On");
        }

        @Override
        public void turnOff() {
            System.out.println("TV Off");
        }
    };

    void method(){
        RemoteControl rcLocalVar = new RemoteControl() {
            @Override
            public void turnOn() {
                System.out.println("Audio On");
            }

            @Override
            public void turnOff() {
                System.out.println("Audio Off");
            }
        };

        rcLocalVar.turnOn();
        rcLocalVar.turnOff();
    }

    void method2(RemoteControl rcParam){
        rcParam.turnOn();
    }
}
