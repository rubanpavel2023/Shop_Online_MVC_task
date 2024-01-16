package ShopOnline.Model;

import ShopOnline.Entity.Purchase;


public class PickupOrderModel implements Order {

    @Override
    public double calculatePriceOrder(Purchase purchase) {
        return purchase.getPrice() * purchase.getQuota();

    }
}


