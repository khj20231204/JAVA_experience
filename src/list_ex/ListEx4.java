package list_ex;
import java.util.*;

/*
 * list.add(new MyList(4));
 * list.add(new MyList().create(4));
 * list.add(MyList.create(4)); <----------- 여기 해당
 */

/* list.add(MyList.create(4));
* class밖에 static 메소드가 들어있는 클래스를 만든다
* 기본 생성자를 만들고
* static create에서 new로 객체 생성
* 호출 시 MyListStaticInt.create 로 static이기 때문에
* 클래스. 으로 바로 메소드 호출
*/
public class ListEx4 {
   void solution(){
      //int형
      List<MyListStaticInt> list1 = new ArrayList<>();
      list1.add(MyListStaticInt.create(4));
      list1.contains(MyListStaticInt.create(4));
      list1.remove(MyListStaticInt.create(4));
      list1.indexOf(MyListStaticInt.create(4));

      //String형
      List<MyListStaticString> list2 = new ArrayList<>();
      list2.add(MyListStaticString.create("victory"));
      list2.contains(MyListStaticString.create("victory"));
      list2.remove(MyListStaticString.create("victory"));
      list2.indexOf(MyListStaticString.create("victory"));
   }
}
class MyListStaticInt{
   int v;

   public MyListStaticInt(int v){ //<--- 기본 생성자
      this.v = v;
   }

   public static MyListStaticInt create(int v) {  //<-- static
      return new MyListStaticInt(v);
   }
   @Override
   public boolean equals(Object obj){
      if(obj instanceof MyListStaticInt){
         int v2 = ((MyListStaticInt)obj).v;
         if(v == v2) return true;
      }

      return false;
   }
}

class MyListStaticString{
   String name;

   public MyListStaticString(String n){ //<--- 기본 생성자
      name = n;
   }

   public static MyListStaticString create(String n){ //<-- static
      return new MyListStaticString(n);
   }

   @Override
   public boolean equals(Object obj){
      if(obj instanceof MyListStaticString){
         String name2 = ((MyListStaticString)obj).name;
         if(name.equals(name2)) return true;
      }

      return false;
   }
}

