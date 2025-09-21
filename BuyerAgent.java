import java.util.List;

public class BuyerAgent {
    private final String name;

    public BuyerAgent(String name) {
        this.name = name;
    }

    public void placeOrder(BrokerAgent broker, Order order) {
        broker.processOrder(this, order);
    }

    public void receiveRecommendation(Product product) {
        if (product != null) {
            System.out.println("Buyer " + name + " received recommendation: " + product.getName() + " for $" + product.getPrice());
        } else {
            System.out.println("Buyer " + name + " received no suitable recommendations.");
        }
    }
}
