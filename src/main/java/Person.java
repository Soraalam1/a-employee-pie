public class Person implements IPayable {
    private String name;

    public Person(String name){
        this.name = name;
    }

    public double calculatePay(){
        return 0;
    }
    public String getType(){
        return "Person";
    }

    public String getName() {
        return name;
    }
    public int compareTo(IPayable person){
        return (int)(calculatePay() - person.calculatePay());
    }
}
