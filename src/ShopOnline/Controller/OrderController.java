package ShopOnline.Controller;

import ShopOnline.Entity.Buyer;
import ShopOnline.Entity.Purchase;

import ShopOnline.Model.DeliveryOrderModel;
import ShopOnline.Model.PickupOrderModel;
import ShopOnline.Utils.Rounder;
import ShopOnline.View.AppView;

public class OrderController {
    private final AppView view = new AppView();
    private final static String CURRENCY = "USD";


    public void getPayment() {
        String [] data = view.getData();
        Buyer buyer = getBuyer(data);
        Purchase purchase = getPurchase(data);
        String output;
        if (purchase.getQuota() <= 2) {
            PickupOrderModel model = new PickupOrderModel();
            String payment = Rounder.roundValue(model.calculatePriceOrder(purchase));
            output = "\nBuyer: " + buyer.getName() + ", " + buyer.getTel() +
                    "\nPayment is " + CURRENCY + " " + payment;
            view.getOutput(output);
        } else {
            DeliveryOrderModel model = new DeliveryOrderModel();
            String payment = Rounder.roundValue(model.calculatePriceOrder(purchase));
            output = "\nBuyer: " + buyer.getName() + ", " + buyer.getTel() +
                    "\nPayment is " + CURRENCY + " " + payment;
            view.getOutput(output);
        }

    }





    public Buyer getBuyer(String [] data) {
        return new Buyer(data[0], data[1]) ;
    }

    public Purchase getPurchase (String [] data){
        return new Purchase(Integer.parseInt(data[2]),
                Double.parseDouble(data[3]));


    }
}
