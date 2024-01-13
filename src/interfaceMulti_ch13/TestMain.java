package interfaceMulti_ch13;

import interfaceMulti_ch13.userBuy.UserBuyInf;
import interfaceMulti_ch13.userSell.UserSellInf;

public class TestMain {
    public static void main(String[] args){

        Customer customer = new Customer();
        customer.buy();
        customer.sell();
        customer.order();
        customer.customerInfo();

        UserBuyInf buyer = new Customer();
        buyer.buy();
        buyer.order();

        UserSellInf seller = new Customer();
        seller.sell();
        seller.order();
    }
}
