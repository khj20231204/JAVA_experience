package interface_.ex;

public class Main {

    public static void main(String[] args){
        RemoteControl rc;
        rc = new Television();
        rc = new Audio();

        SmartTelevision st = new SmartTelevision();
        RemoteControl rc2 = st;
        Searchable sc = st;
    }
}
