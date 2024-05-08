import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ManagementCustomers {

    private List<Customers> customerList;

    public ManagementCustomers() {
        customerList = new ArrayList<>();
    }
    // trong các phương thức thêm (addProduct) và sửa (updateProduct), không cần
    // phải sử dụng Iterator

    // Thêm khách hàng mới
    public void addCustomer(String name, String sdt, String diachi, String cusID) {
        Customers newCustomer = new Customers(name, sdt, diachi, cusID);
        customerList.add(newCustomer);
    }

    // Sửa thông tin của một khách hàng
    public void updateCustomer(String cusID, String newName, String newSdt, String newDiachi) {
        for (Customers customer : customerList) {
            if (customer.getCusID().equals(cusID)) {
                customer.setName(newName);
                customer.setSdt(newSdt);
                customer.setDiachi(newDiachi);
                break;
            }
        }
    }

    // Xóa một khách hàng
    public void deleteCustomer(String cusID) {
        Iterator<Customers> iterator = customerList.iterator(); // su dung iterator de hien thi noi dung cua list
        while (iterator.hasNext()) {
            Customers customer = iterator.next();
            if (customer.getCusID().equals(cusID)) {
                iterator.remove();
                break;
            }
        }
    }

    // Lấy danh sách khách hàng
    public List<Customers> getCustomerList() {
        return customerList;
    }
}
