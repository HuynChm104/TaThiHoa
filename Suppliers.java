
public class Suppliers extends Person {

    private String supplierID;

    public Suppliers(String name, String sdt, String diachi, String supplierID) {
        super(name, sdt, diachi);
        this.supplierID = supplierID;

    }

    public String getSupplierID() {
        return supplierID;
    }

    public void setSupplierID(String supplierID) {
        this.supplierID = supplierID;
    }

}