
class Customers extends Person {
    private String cusID;

    public Customers(String name, String sdt, String diachi, String cusID) {
        super(name, sdt, diachi);
        this.cusID = cusID;

    }

    public String getCusID() {
        return cusID;
    }

    public void setCusID(String cusID) {
        this.cusID = cusID;
    }
}
