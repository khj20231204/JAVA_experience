package interface_.ex;

import java.io.FileInputStream;
import java.util.Properties;

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
