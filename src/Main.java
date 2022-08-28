import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> listOfPersons = new ArrayList<>();
        listOfPersons.add(new Person("John", "Smith", 50));
        listOfPersons.add(new Person("Louie", "de Bourbone", 40));
        listOfPersons.add(new Person("Pedro", "San Miguel", 30));
        Collections.sort(listOfPersons, new PersonsComparator());
        System.out.println(listOfPersons);

    }
}
