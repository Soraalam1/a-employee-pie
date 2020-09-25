public class SalariedEmployee extends Employee {
    double salary;

    public SalariedEmployee(String name, HireDate hireDate, double salary) {
        super(name, hireDate);
        this.salary = salary;
    }

    @Override
    public String printBadge(){
        return "Name: " + getName() + "\n" +
                "Type of employee: Salaried Employee" + "\n"+
                super.getHireDateInfo();
    }
    @Override public String getType(){
        return "Salaried Employee";
    }
    @Override
    public double calculatePay(){
        return salary/12;
    }
}
