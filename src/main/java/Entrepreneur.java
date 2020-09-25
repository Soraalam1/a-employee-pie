public class Entrepreneur extends Person {
    double earnings;

    public Entrepreneur(String name, double earnings) {
        super(name);
        this.earnings = earnings;
    }

    @Override
    public double calculatePay(){
        return earnings;
    }
    @Override public String getType(){
        return "Entrepreneur";
    }
}
