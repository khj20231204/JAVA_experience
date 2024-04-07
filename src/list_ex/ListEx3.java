package list_ex;
import java.util.*;

/*
 * list.add(new MyList(4));
 * list.add(new MyList().create(4)); <----------- 여기 해당
 * list.add(MyList.create(4));
 */

/* list.add(new MyList().create(4));
  * 기본 생성자 없이 create메소드에서 바로 new로 객체 생성
 * static create에서 new로 객체 생성
 * 호출 시 new MyListString().create("victory")
 * new로 객체 생성하는데 MyListString()로 기본 생성자를 호출 후
 * create 메소드 호출
 * 일반적으로 객체 생성하는 MyListString mls = new MyListString()에서
 * 뒤에 new MyListString() 이 부분에서 바로 create 메소드 호출
 */

public class ListEx3 {

   class MyListInt{
      int v;

      public MyListInt create(int v) {
         this.v = v;
         return this;
      }
      @Override
      public boolean equals(Object obj){
         if(obj instanceof MyListInt){
            int v2 = ((MyListInt)obj).v;
            if(v == v2) return true;
         }

         return false;
      }
   }

   class MyListString{
      String name;

      public MyListString create(String n){
         name = n;
         return this;
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

   void solution(){
      //int형
      List<MyListInt> list1 = new ArrayList<>();
      list1.add(new MyListInt().create(4));
      list1.contains(new MyListInt().create(4));
      list1.remove(new MyListInt().create(4));
      list1.indexOf(new MyListInt().create(4));

      //String형
      List<MyListString> list2 = new ArrayList<>();
      list2.add(new MyListString().create("victory"));
      list2.contains(new MyListString().create("victory"));
      list2.remove(new MyListString().create("victory"));
      list2.indexOf(new MyListString().create("victory"));
   }
}
