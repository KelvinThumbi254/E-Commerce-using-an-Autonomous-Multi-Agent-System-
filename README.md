# E-Commerce Multi-Agent System (Java)
## Project Description
The implementation models an e-commerce platform using an autonomous multi-agent system in Java.

We have three main types of agents:

- **Buyer Agent** – Represents a customer who places an order through a broker, evaluates offers, and makes a final purchase decision.
- **Seller Agent** – Represents a retailer or seller offering products. Each seller maintains a list of products and responds to buyer orders via the broker.
- **Broker Agent** – Acts as the mediator between buyers and sellers. It collects offers from sellers, analyses them, and provides recommendations to the buyer by ranking them from the lowest to highest price.

### Additional Components:
- **Product** – Defines the details of items sold (name, price, quantity).
- **Order** – Captures buyer requirements (product name, quantity, max price).
- **Offer** – Summarizes a seller's response to an order, pairing the product with the seller for buyer evaluation.
##  How the System Works
1. **Buyer selects a product** and specifies quantity and the maximum price they are willing to pay.
2. **Broker receives the order** and forwards it to all registered sellers.
3. **Sellers respond** with matching products if available.
4. **Broker evaluates offers** and recommends them to the buyer (ranked from cheapest to most expensive).
5. **Buyer decides** whether to purchase from one of the offers or decline all.

---

##  Project Structure
```
├── Product.java       # Defines Product attributes (name, price, quantity)
├── Order.java         # Defines Order attributes (product name, max price, quantity)
├── Offer.java         # Pairs a Product with its Seller for buyer evaluation
├── SellerAgent.java   # Represents a seller, responds to broker requests
├── BrokerAgent.java   # Mediates between buyers and sellers, collects offers
├── BuyerAgent.java    # Represents buyer, places orders and evaluates offers
└── Main.java          # Demonstrates the system in action
```
## Running the Program
1. Compile all Java files:
```bash
javac *.java
```
2. Run the `Main` class:
```bash
java Main
```
3. Observe buyer-broker-seller interactions in the console output.

##  Features
- Autonomous buyer and seller agents.
- Broker agent for centralized offer collection and recommendation.
- Products and orders with configurable attributes.
- Basic price-based ranking of offers.
- Simple and extendable design using OOP principles.

## Future Enhancements
- Implement multiple buyers interacting concurrently.
- Support more complex constraints (e.g., delivery time, seller rating).
- Expand offer ranking to include additional factors beyond price.
- Add a GUI to visualize the transactions interactively.
