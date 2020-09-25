public class Employee extends Person {
    private HireDate hireDate;

    public Employee(String name, HireDate hireDate) {
        super(name);
        this.hireDate = hireDate;
    }

    public String printBadge(){
       return "Name: " + getName() + "\n" + getHireDateInfo();
    }

    public String getHireDateInfo(){
        return "Hire Date: " + this.hireDate.getMonth() + "/" +
                this.hireDate.getDate() + "/" + this.hireDate.getYear();
    }
}
