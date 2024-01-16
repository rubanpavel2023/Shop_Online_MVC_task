package ShopOnline.Model;

import ShopOnline.Entity.Purchase;

public interface Order {
     public double calculatePriceOrder(Purchase purchase);
}
