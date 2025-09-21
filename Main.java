public class Main {
    public static void main(String[] args) {
// Create broker agent
        BrokerAgent broker = new BrokerAgent();

// Create seller agents and add products
        SellerAgent seller1 = new SellerAgent("Seller 1");
        seller1.addProduct(new Product("Laptop", 1000.0, 10));
        seller1.addProduct(new Product("Phone", 500.0, 20));

        SellerAgent seller2 = new SellerAgent("Seller 2");
        seller2.addProduct(new Product("Laptop", 950.0, 5));
        seller2.addProduct(new Product("Phone", 450.0, 15));

        broker.registerSeller(seller1);
        broker.registerSeller(seller2);

// Create buyer agent and place an order
        BuyerAgent buyer = new BuyerAgent("Buyer 1");
        Order order = new Order("Laptop", 1000.0, 1);
        buyer.placeOrder(broker, order);
    }
}