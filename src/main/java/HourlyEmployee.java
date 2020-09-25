public class HourlyEmployee extends Employee {
    double hourlyRate;
    double hoursWorked;

    public HourlyEmployee(String name, HireDate hireDate, double hourlyRate, double hoursWorked) {
        super(name, hireDate);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    @Override
    public double calculatePay(){
        return hourlyRate * hoursWorked;
    }

    @Override
    public String printBadge(){
        return "Name: " + getName() + "\n" +
                "Type of employee: Hourly Employee" + "\n"+
                super.getHireDateInfo();
    }
    @Override public String getType(){
        return "Hourly Employee";
    }
}
