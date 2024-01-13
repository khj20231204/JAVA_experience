package interface_.ex;

public class TestMain {

    public static void main(String[] args){
        RemoteControl rc;
        rc = new Television();
        rc = new Audio();

        SmartTelevision st = new SmartTelevision();
        RemoteControl rc2 = st;
        Searchable sc = st;

        Television tv = new Television();
        Audio audio = new Audio();

        TestMain.paramInterface(tv);
        TestMain.paramInterface(audio);

        TestMain.paramInterface(new Television());
        TestMain.paramInterface(new Audio());


    }
    public static void paramInterface(RemoteControl rc){

    }
    public static RemoteControl returnInterface(){
        Television tv = new Television();
        Audio audio = new Audio();

        //return tv;
        //return audio;
        //return new Television();
        return new Audio();
    }
}
