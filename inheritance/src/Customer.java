/*
* 일반 고객: 고객 아이디, 고객 이름, 고객 등급, 보너스 포인트, 보너스 포인트 적립비율
* 물품 구매시 1%의 보너스 포인터 적립
* */


public class Customer {

    protected String id;
    protected String name;
    protected String grade;
    public int bonusPoint;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGrade() {
        return grade;
    }

    public int getBonusPoint() {
        return bonusPoint;
    }

    public double getBonusRate() {
        return bonusRate;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBonusPoint(int bonusPoint) {
        this.bonusPoint = bonusPoint;
    }

    public double bonusRate;

    public Customer(){
        this.grade = "SILVER";
        this.bonusRate = 0.01;
    }

    public void calcPrice(int price){
        bonusPoint += (int) (price*bonusRate);
    }

    public String showCustomerInfo(){
        return this.name+"님의 등급은 " + this.grade +"이며, 보너스 포인트는 " + this.bonusPoint + "입니다.";
    }
}
