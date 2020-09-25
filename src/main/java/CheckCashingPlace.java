import java.util.ArrayList;

public class CheckCashingPlace {
    public static void main(String[] args) {
        Entrepreneur entrepreneur = new Entrepreneur("Scrooge McDuck", 20000.0);
        SalariedEmployee salaried = new SalariedEmployee("Donald Duck", new HireDate(6,9,1934),
                12000);
        HourlyEmployee hourly = new HourlyEmployee("Daisy Duck", new HireDate(6,7,1940),
                10,40);

        HumanResources humanResources = new HumanResources();

        Person[] payablePeople = new Person[]{entrepreneur,salaried,hourly};

        Employee[] employees = new Employee[]{salaried,hourly};

        humanResources.issueBadge(employees);

        System.out.println("\n" + "Prior to sorting by pay... ");

        humanResources.payPerson(payablePeople);

        ArrayList<IPayable> unsortedPeople = new ArrayList<IPayable>();

        unsortedPeople.add(entrepreneur);
        unsortedPeople.add(salaried);
        unsortedPeople.add(hourly);

        System.out.println("\n");

        humanResources.sortPeopleByIncome(unsortedPeople);

        System.out.println("I freakin killed it");

    }
}
