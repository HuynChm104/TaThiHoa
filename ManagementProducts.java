import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ManagementProducts {
    private List<Products> productList;

    public ManagementProducts() {
        productList = new ArrayList<>();
    }

    // Thêm sản phẩm mới
    public void addProduct(String productId, String productName, double price, int quantity, String productType) {
        Products newProduct = new Products(productId, productName, price, quantity, productType);
        productList.add(newProduct);
    }

    // Sửa thông tin của một sản phẩm
    public void updateProduct(String productId, double newPrice, int newQuantity, String newProductType) {
        for (Products product : productList) {
            if (product.getProductId().equals(productId)) {
                product.setPrice(newPrice);
                product.setQuantity(newQuantity);
                product.setProductType(newProductType);
                break;
            }
        }
    }

    // Xóa một sản phẩm
    public void deleteProduct(String productId) {
        Iterator<Products> iterator = productList.iterator();
        while (iterator.hasNext()) {
            Products product = iterator.next();
            if (product.getProductId().equals(productId)) {
                iterator.remove();
                break;
            }
        }
    }

    // Lấy danh sách sản phẩm
    public List<Products> getProductList() {
        return productList;
    }
}