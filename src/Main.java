import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> listOfPersons = new ArrayList<>();
        listOfPersons.add(new Person("John", "Smith", 50));
        listOfPersons.add(new Person("Louie", "de Bourbone", 20));
        listOfPersons.add(new Person("Pedro", "San Miguel", 30));
        Comparator<Person> comparator = (Person o1, Person o2) -> {
            String[] surnameo1 = o1.getSurname().split(" ");
            String[] surnameo2 = o2.getSurname().split(" ");
            if (surnameo1.length > surnameo2.length) {
                return +1;
            } else if (surnameo1.length < surnameo2.length) {
                return -1;
            } else if (o1.getAge() > o2.getAge()) {
                return +1;
            } else if (o1.getAge() < o2.getAge()) {
                return -1;
            }
            return 0;
        };
        Collections.sort(listOfPersons, comparator);
        System.out.println(listOfPersons);
    }
}
