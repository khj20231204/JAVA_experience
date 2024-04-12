package stream.ex;

public class Student2 {

   String name;
   int ban;
   int totalScore;

   public Student2(String n, int b, int t){
      name = n;
      ban = b;
      totalScore = t;
   }

   String getName(){
      return name;
   }

   int getBan(){
      return ban;
   }

   int getTotalScore(){
      return totalScore;
   }

   public String toString(){
      return String.format("[%s %d %d]",name, ban, totalScore);
   }
}
