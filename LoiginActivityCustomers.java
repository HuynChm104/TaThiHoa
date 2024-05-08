import java.util.List;
import java.util.Scanner;

public class LoiginActivityCustomers {
    private ManagementCustomers managementCustomers;
    private Scanner scanner;

    public LoiginActivityCustomers() {
        managementCustomers = new ManagementCustomers();
        scanner = new Scanner(System.in);
    }

    public void Menu() {
        System.out.println("Welcome to Customer Management System");
        System.out.println("1. Add Customer");
        System.out.println("2. Update Customer");
        System.out.println("3. Delete Customer");
        System.out.println("4. View All Customers");
        System.out.println("5. Exit");
    }

    public void addCustomer() {
        System.out.println(" Customer Name:");
        String name = scanner.nextLine();
        System.out.println("Customer Phone Number:");
        String phoneNumber = scanner.nextLine();
        System.out.println(" Customer Address:");
        String address = scanner.nextLine();
        System.out.println("Customer ID:");
        String id = scanner.nextLine();

        managementCustomers.addCustomer(name, phoneNumber, address, id);
        System.out.println("Customer added successfully!");
    }

    public void updateCustomer() {
        System.out.println(" Customer ID to Update:");
        String id = scanner.nextLine();
        System.out.println("New Name:");
        String newName = scanner.nextLine();
        System.out.println("New Phone Number:");
        String newPhoneNumber = scanner.nextLine();
        System.out.println("Enter New Address:");
        String newAddress = scanner.nextLine();

        managementCustomers.updateCustomer(id, newName, newPhoneNumber, newAddress);
        System.out.println("Customer details updated successfully!");
    }

    public void deleteCustomer() {
        System.out.println(" Customer ID to Delete:");
        String id = scanner.nextLine();
        managementCustomers.deleteCustomer(id);
        System.out.println("Customer deleted successfully!");
    }

    public void viewAllCustomers() {
        List<Customers> customers = managementCustomers.getCustomerList();
        System.out.println("All Customers:");
        for (Customers customer : customers) {
            System.out.println(customer);
        }
    }

    public void start() {
        int choice;
        do {
            Menu();
            System.out.println("Enter your choice:");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addCustomer();
                    break;
                case 2:
                    updateCustomer();
                    break;
                case 3:
                    deleteCustomer();
                    break;
                case 4:
                    viewAllCustomers();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 5);
    }

    public static void main(String[] args) {
        LoiginActivityCustomers loginActivity = new LoiginActivityCustomers();
        loginActivity.start();
    }
}
