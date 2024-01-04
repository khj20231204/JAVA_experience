package collectionframework.ex;

public class Member {
    private int memberId;
    private String memberName;

    public Member(int id, String name){
        this.memberId = id;
        this.memberName = name;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }
    
    public String toString(){
        return "이름:"+ memberName + " , ID:"+ memberId;
    }
}
