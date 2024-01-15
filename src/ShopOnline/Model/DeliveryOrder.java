package ShopOnline.Model;

public class DeliveryOrder implements Order {
    private double price;
    private double quantity;
    private double deliveryChargePercent;

    public DeliveryOrder(double price, double quantity, double deliveryChargePercent) {
        this.price = price;
        this.quantity = quantity;
        this.deliveryChargePercent = deliveryChargePercent;
    }

    @Override
    public double calculatePriceOrder() {
        double orderCost = price * quantity;
        return orderCost + (orderCost * deliveryChargePercent / 100);
    }
}
