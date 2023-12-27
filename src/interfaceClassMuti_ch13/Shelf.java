package interfaceClassMuti_ch13;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Shelf {

    private ArrayList<String> shelf;

    public Shelf(){
        System.out.println("shelf 생성자 호출");
        shelf = new ArrayList<String>();
    }

    public ArrayList<String> getShelf(){
        return shelf;
    }

    public void addShelf(String title){
        shelf.add(title);

        for(String s : shelf){
            System.out.println("addshelf: "+s);
        }

        System.out.println("addshelf size: "+shelf.size());

        System.out.println("addshelf의 shelf: "+shelf);
    }

    public void deleteShelf(){
        shelf.remove(0);
    }

    //BookShelf
    public int getCount(){
        System.out.println("getCount의 shelf: "+shelf);

        return shelf.size();
    }
}
