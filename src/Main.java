import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Person> listOfPersons = new ArrayList<>();
        listOfPersons.add(new Person("John", "Smith", 15));
        listOfPersons.add(new Person("Louie", "de Bourbone", 40));
        listOfPersons.add(new Person("Pedro", "San Miguel", 17));
        listOfPersons.add(new Person("Edvin", "Van Der Saar", 30));
        Predicate<Person> isEighteen = (Person age) -> age.getAge() <= 18;
        listOfPersons.removeIf(isEighteen);
        Collections.sort(listOfPersons, new PersonsComparator());
        System.out.println(listOfPersons);
    }
}
