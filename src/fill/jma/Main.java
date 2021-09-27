package fill.jma;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;


public class Main {


    public static final Collection<Employee> people(){
        Collection<Employee> peopleList = new ArrayList<>(7);
        List<String> nameOfDeveloperSubordination = List.of("Chak Jakson","Betty Cramer","Katy Exit");
        List<String> nameOfCOneAnalyzeSubordination=  List.of("Katy Pay","Jorge Red");
        Employee Chak = new Employee("Chak", "Jakson", 1500, "C1 Analyze");
        Employee Betty = new Employee("Betty", "Cramer", 1200, "C1 Analyze");
        Employee Katy = new Employee("Katy", "Exit", 1200, "C1 Analyze");
        Manager Jack = new Manager("Jack", "Parker", 1500, "C1 Analyze", nameOfCOneAnalyzeSubordination);
        Employee Liza = new Employee("Katy", "Pay", 1200, "Developer");
        Manager Jhon = new Manager("Jack", "Parker", 1500, "Developer", nameOfDeveloperSubordination);
        Employee Jorge = new Employee("Jorge", "Red", 1200, "Developer");
        peopleList.add(Chak);
        peopleList.add(Betty);
        peopleList.add(Jack);
        peopleList.add(Katy);
        peopleList.add(Liza);
        peopleList.add(Jhon);
        peopleList.add(Jorge);
        return peopleList;
    }


    public static void main(String[] args) {

        final Collection<Employee> people = people();
        Main main = new Main();



        main.people().stream()
                .forEach(System.out::println);

        System.out.println();

        main.people().stream()
                .sorted(Comparator.comparing(Employee::getSurname))
                .forEach(System.out::println);

        System.out.println();

        main.people().stream()
                .sorted(Comparator.comparing(Employee::getOffer))
                .forEach(System.out::println);


        System.out.println();
        Offer offer = new Offer();
        offer.middleOffer("Developer");
        offer.middleOffer("C1 Analyze");

    }
}
