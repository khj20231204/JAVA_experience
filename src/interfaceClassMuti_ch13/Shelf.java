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
        }
        public String deleteShelf(){
            String str = "";

            if(shelf.size()>0)
               str = shelf.remove(0);

            return str;
        }
        //BookShelf
        public int getCount(){
               return shelf.size();
        }
    }
