package ShopOnline.Controller;

import ShopOnline.Model.Order;

public class OrderController {
    private Order order;

    public OrderController(Order order) {
        this.order = order;
    }

    public double getOrder() {
        return order.calculatePriceOrder();
    }
}
