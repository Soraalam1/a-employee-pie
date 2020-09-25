
import java.util.ArrayList;
import java.util.Collections;

public class HumanResources {
    public void issueBadge(Employee [] employees){
        for (Employee current: employees) {
            System.out.println(current.printBadge());
        }
    }
    public void printPaymentInfo(IPayable person){
        System.out.println(person.getType() + " should be paid " + person.calculatePay());
    }
    public void payPerson(Person[] people){
        for(Person current: people){
            printPaymentInfo(current);
        }
    }
    public void sortPeopleByIncome(ArrayList<IPayable> people){
        Collections.sort(people);
        Person[] sorted = new Person[people.size()];
        sorted = people.toArray(sorted);
        payPerson(sorted);
    }
}
