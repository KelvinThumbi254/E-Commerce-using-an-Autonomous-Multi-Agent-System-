import java.util.ArrayList;
import java.util.List;

public class SellerAgent {
    private final String name;
    private final List<Product> productList;

    public SellerAgent(String name) {
        this.name = name;
        this.productList = new ArrayList<>();
    }

    public void addProduct(Product product) {
        productList.add(product);
    }

    public Product respondToRequest(Order order) {
        for (Product product : productList) {
            if (product.getName().equalsIgnoreCase(order.getProductName()) &&
                    product.getPrice() <= order.getMaxPrice() &&
                    product.getQuantity() >= order.getQuantity()) {
                return product;
            }
        }
        return null;
    }

    public String getName() {
        return name;
    }
}

