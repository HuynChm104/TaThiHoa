
public class Person {
    private String name;
    private String sdt;
    private String diachi;

    public Person(String name, String sdt, String diachi) {
        this.name = name;
        this.sdt = sdt;
        this.diachi = diachi;
    }

    public String getName() {
        return this.name;
    }

    public String getSdt() {
        return this.sdt;
    }

    public String getDiachi() {
        return this.diachi;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

}
