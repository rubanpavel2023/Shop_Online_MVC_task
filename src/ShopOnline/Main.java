package ShopOnline;

import ShopOnline.Controller.OrderController;

public class Main {
    public static void main(String[] args) {

        OrderController controller = new OrderController();
        controller.getPayment();
    }
}
