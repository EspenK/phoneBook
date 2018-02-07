import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        PhoneBook p = new PhoneBook();
        p.addPerson(new Person("Bjarne"));
        p.addPerson(new Person("Kåre", "99881122"));

        p.printList();
    }
}
