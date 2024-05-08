import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ManagementCustomers {

    private Connection connection;

    public ManagementCustomers() {
        // kết mối với sql
        try {
            connection = DriverManager.getConnection(Database.HOST_URI, Database.USER, Database.PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Thêm khách hàng mới
    public void addCustomer(String name, String sdt, String diachi, String cusID) {
        String query = "INSERT INTO Customers VALUES (?, ?, ?, ?)";
        try {
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, cusID);
            statement.setString(2, name);
            statement.setString(3, sdt);
            statement.setString(4, diachi);
            statement.executeUpdate();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Sửa thông tin của một khách hàng
    public void updateCustomer(String cusID, String newName, String newSdt, String newDiachi) {
        String query = "UPDATE Customers SET CusName = ?, CusPhoneNumber = ?, CusAddress = ? WHERE CusID = ?";
        try {
            PreparedStatement statement = connection.prepareStatement(query); // được sử dụng để thực hiện các truy vấn
                                                                              // truy xuất giá trị từ cơ sở dữ liệu
                                                                              // (select).
            statement.setString(1, newName);
            statement.setString(2, newSdt);
            statement.setString(3, newDiachi);
            statement.setString(4, cusID);
            statement.executeUpdate();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Xóa một khách hàng
    public void deleteCustomer(String cusID) {
        String query = "DELETE FROM Customers WHERE CusID = ?";
        try {
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, cusID);
            statement.executeUpdate();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Lấy danh sách khách hàng
    public List<Customers> getCustomerList() {
        List<Customers> customerList = new ArrayList<>();
        String query = "SELECT * FROM Customers";
        try {
            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Customers customer = new Customers(
                        resultSet.getString("CusName"),
                        resultSet.getString("CusPhoneNumber"),
                        resultSet.getString("CusAddress"),
                        resultSet.getString("CusID"));
                customerList.add(customer);
            }
            resultSet.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return customerList;
    }

    public void closeConnection() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
