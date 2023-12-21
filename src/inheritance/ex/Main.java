package inheritance.ex;

public class Main {
    public static void main(String[] args) {

        Customer c = new Customer();
        c.setId("1111");
        c.setName("김유신");
        c.setBonusPoint(2000);
        System.out.println(c.showCustomerInfo());
        //김유신님의 등급은 SILVER이며, 보너스 포인트는 2000입니다.

        c.calcPrice(30000);
        System.out.println(c.showCustomerInfo());
        //김유신님의 등급은 SILVER이며, 보너스 포인트는 2300입니다.

        VIPCustomer vc = new VIPCustomer();
        vc.setId("2222");
        vc.setName("강감찬");
        vc.setBonusPoint(2000);
        System.out.println(vc.showCustomerInfo());
        //강감찬님의 등급은 VIP이며, 보너스 포인트는 2000입니다.

        vc.calcPrice(30000);
        System.out.println(vc.showCustomerInfo());
        //강감찬님의 등급은 VIP이며, 보너스 포인트는 3500입니다.

        /* 형 변환 */
        VIPCustomer vc2 = new VIPCustomer();
        vc2.setId("3333");
        vc2.setName("을지문덕");
        vc2.setBonusPoint(3100);
        Customer c2 = vc2;

        System.out.printf("c2.grade:"+c2.grade+"\n");  //c2.grade:VIP
        //c2.discount 나 c2.agentID로 접근 불가

        //c2의 메소드가 아니라 vc2의 메소드가 출력
        System.out.println(c2.showCustomerInfo());
        /*
        을지문덕님의 등급은 VIP이며, 보너스 포인트는 3100입니다.
        할인율은0.1이고, 상담원ID는 12923입니다.
        */
    }
}