package ShopOnline.View;

import ShopOnline.Controller.OrderController;
import ShopOnline.Model.DeliveryOrder;
import ShopOnline.Model.Order;
import ShopOnline.Model.PickupOrder;

public class Main {
    public static void main(String[] args) {

        Order pickup = new PickupOrder(65.80, 2.50);
        OrderController pickupOrderController = new OrderController(pickup);
        System.out.println("The cost of an order for pickup will be: " + pickupOrderController.getOrder() + " UAH");

        Order delivery = new DeliveryOrder(65.80, 2.50, 10.0);
        OrderController deliveryOrderController = new OrderController(delivery);
        System.out.println("The cost of the order including delivery will be: " + deliveryOrderController.getOrder() + " UAH");

    }

}