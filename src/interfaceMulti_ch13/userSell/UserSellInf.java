package interfaceMulti_ch13.userSell;

public interface UserSellInf {

    int LIMIT = 20;

    void sell();

    default void order(){
        System.out.println("Order of Sell");
    }
}
