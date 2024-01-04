package collectionframework.ex;

import java.util.HashSet;
import java.util.Iterator;

public class MemberHashSet {

    HashSet<Member> memberhs;
    public MemberHashSet() {
         memberhs = new HashSet<>();
    }

    public MemberHashSet(int size){
        memberhs = new HashSet<>(size);
    }

    public void addMember(Member memeber){
        memberhs.add(memeber);
    }

    public boolean removeMember(int memberId){

        Iterator iter = memberhs.iterator();
        while (iter.hasNext()){
            Object o = iter.next();
            Member m = (Member) o;
            if(m.getMemberId() == memberId) {
                iter.remove();
                return true;
            }
        }

        return false;
    }

    public void showAllMember(){

        Iterator iter = memberhs.iterator();
        while (iter.hasNext()){
            Object o = iter.next();
            Member m = (Member) o;
            System.out.println(m.toString());
        }
    }
}
