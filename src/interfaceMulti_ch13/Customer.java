package interfaceMulti_ch13;

import interfaceMulti_ch13.userBuy.UserBuyInf;
import interfaceMulti_ch13.userSell.UserSellInf;

public class Customer implements UserBuyInf, UserSellInf {
    @Override
    public void buy() {
        System.out.println("Buy of Custmoer");
    }

    @Override
    public void sell() {
        System.out.println("Sell of Customer");
    }

    @Override
    public void order() {
        UserBuyInf.super.order();
    }

    public void customerInfo(){
        System.out.println("Customer Info");
    }

}
