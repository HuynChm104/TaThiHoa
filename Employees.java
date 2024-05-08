
class Employess extends Person {
    private String empID;
    private String empRole;
    private double salary;

    public Employess(String name, String sdt, String diachi, String empID, String empRole, double salary) {
        super(name, sdt, diachi);
        this.empID = empID;
        this.empRole = empRole;
        this.salary = salary;
    }

    public void setEmpRole(String role) {
        this.empRole = role;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getEmpRole() {
        return empRole;
    }

    public double getSalary() {
        return salary;
    }

    public String getEmpID() {
        return empID;
    }

    public void setEmpID(String empID) {
        this.empID = empID;
    }
}