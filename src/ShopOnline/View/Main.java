package ShopOnline.View;

import ShopOnline.Controller.OrderController;
import ShopOnline.Model.DeliveryOrder;
import ShopOnline.Model.Order;
import ShopOnline.Model.PickupOrder;
import ShopOnline.Utils.Rounder;

public class Main {
    public static void main(String[] args) {
        Order pickup = new PickupOrder(65.80, 1.50);
        OrderController pickupOrderController = new OrderController(pickup);
        String amountRounded1 = Rounder.roundValue(pickupOrderController.getOrder());
        System.out.println("The cost of an order for pickup will be: " + amountRounded1 + " UAH");

        Order delivery = new DeliveryOrder(65.80, 1.50, 10.0);
        OrderController deliveryOrderController = new OrderController(delivery);
        String amountRounded2 = Rounder.roundValue(deliveryOrderController.getOrder());
        System.out.println("The cost of the order including delivery will be: " + amountRounded2 + " UAH");




    }

}