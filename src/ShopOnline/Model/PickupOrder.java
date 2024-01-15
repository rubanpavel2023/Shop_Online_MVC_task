package ShopOnline.Model;

public class PickupOrder implements Order {

    private double price;
    private double quantity;

    public PickupOrder(double price, double quantity) {
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public double calculatePriceOrder() {
        return price * quantity;
    }
}


