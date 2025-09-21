public class Order {
    private final String productName;
    private final double maxPrice;
    private final int quantity;

    public Order(String productName, double maxPrice, int quantity) {
        this.productName = productName;
        this.maxPrice = maxPrice;
        this.quantity = quantity;
    }

    public String getProductName() {
        return productName;
    }

    public double getMaxPrice() {
        return maxPrice;
    }

    public int getQuantity() {
        return quantity;
    }
}


