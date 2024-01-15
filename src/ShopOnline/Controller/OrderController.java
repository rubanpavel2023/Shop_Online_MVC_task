package ShopOnline.Controller;

import ShopOnline.Model.Order;
import ShopOnline.Utils.Rounder;

public class OrderController {
    private Order order;

    public OrderController(Order order) {
        this.order = order;
    }

    public String getOrder() {
        double cost = order.calculatePriceOrder();
        return Rounder.roundValue(cost);
    }
}
