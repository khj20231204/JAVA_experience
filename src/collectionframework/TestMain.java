package collectionframework;

import java.util.*;
public class TestMain {
   public static void main(String[] args){

      /*
      List의 get은 idx
      Map의 get은 key
       */

      //List
      List<Integer> intList = new ArrayList<>();
      //add(element), add(idx, element)
      intList.add(24);
      intList.add(53);
      intList.add(19);
      intList.add(1,99); //24 99 53 19 인덱스1의 자리에 99가 들어가고 나머지 수들은 뒤로 밀려난다
      //get(idx)
      intList.get(1); //99
      //contains(element)
      intList.contains(99);
      //remove(element), remove(idx) : 글자는 element, 숫자는 index
      intList.remove(0);
      //indexOf(element)
      intList.indexOf(23); //-1
      intList.indexOf(99); //0

      List<String> strList = new ArrayList<>();
      strList.add("a");
      strList.add("b");
      strList.add(1,"c"); //[a, c, b]
      strList.get(2); //b
      strList.contains("a"); //true
      strList.remove("a"); //[c, b]
      strList.remove(0); //[b]
      strList.indexOf("b"); //0

      //Set
      Set<Integer> intSet = new HashSet<>();
      //add(element)
      intSet.add(43);
      intSet.add(57);
      Iterator iter = intSet.iterator();
      while(iter.hasNext()){
         iter.next();
         //System.out.println(iter.next());
      }
      //contains(element)
      intSet.contains(57); //true
      //remove(element)
      intSet.remove(57); //true

      Set<String> strSet = new HashSet<>();
      strSet.add("a");
      strSet.add("b");
      strSet.contains("b"); //true
      strSet.remove("a"); //true

      //Map
      Map<Integer, Integer> intMap = new HashMap<>();
      //put(key, value) 키가 같으면 덮어쓰고, 키가 다르면 추가, 밸류는 상관 없다
      intMap.put(3,45);
      intMap.put(3,50); //{3=50}
      intMap.put(13,50); //{3=50, 13=50}
      //get(key)
      intMap.get(3);
      intMap.get(3); //50
      intMap.get(5); //null
      //containsKey(key)
      intMap.containsKey(3); //true
      intMap.containsKey(5); //false
      //remove(key) key가 있으면 value반환, key가 없으면 null반환
      //remove(key,value) key가 없으면 false, value가 없으면 false, key와 value가 일치하면 true
      intMap.remove(3); //50
      intMap.remove(8); //null
      intMap.remove(11, 55); //false
      intMap.remove(13, 55); //false
      intMap.remove(13, 50); //true



      Map<String, Integer> strMap = new HashMap<>();
   }
}
