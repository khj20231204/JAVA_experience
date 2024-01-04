package collectionframework.ex;

import java.util.*;

public class Main {
   public static void main(String[] str){
        //IteratorEx.solution();
       //MyHashSetEx.solution();

       MemberHashSet mymember = new MemberHashSet();

       Member member = new Member(111,"강감찬");
       mymember.addMember(member);
       member = new Member(112,"이순신");
       mymember.addMember(member);

       mymember.showAllMember();



    }
}
