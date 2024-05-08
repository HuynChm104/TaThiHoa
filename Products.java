
public class Products {
    private String productId;
    private String productName;
    private double price;
    private int quantity;
    private String productType;

    public Products(String productId, String productName, double price, int quantity, String productType) {
        if (!productId.isEmpty())
            this.productId = productId;
        else
            throw new IllegalArgumentException("Fill in the ID");

        if (!productName.isEmpty())
            this.productName = productName;
        else
            throw new IllegalArgumentException("Fill in the name");

        this.price = price;
        this.quantity = quantity;
        this.productType = productType;
    }

    public void setPrice(double p) {
        this.price = p;
    }

    public void setQuantity(int q) {
        this.quantity = q;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getProductType() {
        return productType;
    }

    public String getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}