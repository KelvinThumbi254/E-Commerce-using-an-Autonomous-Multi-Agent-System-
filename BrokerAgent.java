import java.util.ArrayList;
import java.util.List;

public class BrokerAgent {
    private final List<SellerAgent> sellerAgents;

    public BrokerAgent() {
        this.sellerAgents = new ArrayList<>();
    }

    public void registerSeller(SellerAgent seller) {
        sellerAgents.add(seller);
    }

    public void processOrder(BuyerAgent buyer, Order order) {
        Product bestOffer = null;
        for (SellerAgent seller : sellerAgents) {
            Product offer = seller.respondToRequest(order);
            if (offer != null && (bestOffer == null || offer.getPrice() < bestOffer.getPrice())) {
                bestOffer = offer;
            }
        }
        buyer.receiveRecommendation(bestOffer);
    }
}
