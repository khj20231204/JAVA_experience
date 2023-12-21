package inheritance.ex;/*
* 단골 고객은 10%를 할인 해 준다.
* 보너스 포인트는 제품 가격의 5%를 적립해 준다.
* 전문 상담원이 배정된다.
*/

public class VIPCustomer extends Customer {
    public double discount;
    public String agentID;
    public VIPCustomer(){

        this.grade = "VIP";
        this.bonusRate = 0.05;
        this.discount = 0.1;
        this.agentID = "12923";
    }

    public String showCustomerInfo(){
        return this.name+"님의 등급은 " + this.grade +"이며, 보너스 포인트는 " + this.bonusPoint + "입니다. \n"
                + "할인율은" + this.discount + "이고, 상담원ID는 " + this.agentID + "입니다.";
    }
}
