package list_ex;
import java.util.*;

/*
* list.add(new MyList(4)); <----------- 여기 해당
* list.add(new MyList().create(4));
* list.add(MyList.create(4));
*/
public class ListEx2 {
   class MyListInt{
      //int형 처리
      int v;

      public MyListInt(int v){
         this.v = v;
      }

      @Override
      public boolean equals(Object obj){
         if(obj instanceof MyListInt) {
            int v1 = ((MyListInt)obj).v;
            if (this.v == v1) return true;
         }
         return false;
      }
   }
   class MyListString{
      //String형 처리
      String name;

      public MyListString(String n){
         name = n;
      }
      @Override
      public boolean equals(Object obj){
         if(obj instanceof MyListString){
            String name2 = ((MyListString)obj).name;

            if(name.equals(name2)) return true;
         }

         return false;
      }
   }
   public void solution(){
      /*
      * List의 add, contains, remove, indexof는
      * equals만 오버라이딩 하면 사용할 수 있다
      * */

      //int형 add, contains, remove, indexof
      List<MyListInt> list1 = new ArrayList<>();
      list1.add(new MyListInt(4));
      list1.contains(new MyListInt(4));
      list1.remove(new MyListInt(4));
      list1.indexOf(new MyListInt(4));
      list1.get(list1.indexOf(new MyListInt(4)));

      //String형 add, contains, remove, indexof
      List<MyListString> list2 = new ArrayList<>();
      list2.add(new MyListString("victory"));
      list2.contains(new MyListString("victory"));
      list2.remove(new MyListString("victory"));
      list2.indexOf(new MyListString("victory"));
      list2.get(list2.indexOf(new MyListString("victory")));
   }

}
