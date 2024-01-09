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

        Television tv = new Television();
        Audio audio = new Audio();

        Main.paramInterface(tv);
        Main.paramInterface(audio);

        Main.paramInterface(new Television());
        Main.paramInterface(new Audio());


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
