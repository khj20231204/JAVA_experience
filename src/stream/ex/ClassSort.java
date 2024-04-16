package stream.ex;
import jdk.dynalink.linker.ConversionComparator;

import java.util.*;

public class ClassSort {

   public class Student{
      String name;
      int ban;

      public Student(String s, int b){
         name = s;
         ban = b;
      }
      public String getName(){
         return name;
      }
      public int getBan(){
         return ban;
      }
   }
   public void classSortSolution(){
      List<Student> list = new ArrayList<>();

      list.add(new Student("be",3));
      list.add(new Student("you",1));
      list.add(new Student("bag",6));
      list.add(new Student("vertical",7));
      list.add(new Student("office",5));

      //sort
      ////sorted(람다식)
      list.stream().sorted((i1, i2) -> i1.name.compareTo(i2.name)).forEach(s -> System.out.println(s.name));
      list.stream().sorted((i1,i2) -> i1.ban - i2.ban).forEach(i -> System.out.println(i.ban));
      ////sorted(Comparator.comparing(변수)) - reversed 불가
      list.stream().sorted(Comparator.comparing(i -> i.name)).forEach(s -> System.out.println(s.name));
      list.stream().sorted(Comparator.comparing(i -> i.ban)).forEach(s -> System.out.println(s.ban));
      ////sorted(Comparator.comparing(클래스::함수)) - revered 가능
      list.stream().sorted(Comparator.comparing(Student::getBan).reversed()).forEach(s -> System.out.println(s.ban));
      list.stream().sorted(Comparator.comparing(Student::getName).reversed()).forEach(s -> System.out.println(s.name));

      //filter
      list.stream().filter(i -> !i.name.startsWith("b")).forEach(s -> System.out.println(s.name));
      list.stream().filter(i -> i.ban > 5).forEach(i -> System.out.println(i.ban));
   }
}
