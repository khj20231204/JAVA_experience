package interfaceMulti_ch13.userBuy;

public interface UserBuyInf {
    int LIMIT = 10;
    void buy();
    default void order() {
        System.out.println("Order to Buy");
    }
}
