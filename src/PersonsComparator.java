import java.util.Comparator;

public class PersonsComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        String[] surnameo1 = o1.getSurname().split(" ");
        String[] surnameo2 = o2.getSurname().split(" ");
        if (surnameo1.length > surnameo2.length) {
            return +1;
        } else if (surnameo1.length < surnameo2.length) {
            return -1;
        } else if (o1.getAge() > o2.getAge()) {
            return +1;
        }
        return -1;
    }
}
