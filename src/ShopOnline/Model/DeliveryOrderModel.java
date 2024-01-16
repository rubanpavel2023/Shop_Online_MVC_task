package ShopOnline.Model;

import ShopOnline.Entity.Purchase;


public class DeliveryOrderModel implements Order {
    int surcharge = 5;

    @Override
    public double calculatePriceOrder(Purchase purchase) {
        double cost = purchase.getPrice() * purchase.getQuota();
        return cost + cost * surcharge / 100;
    }
}


