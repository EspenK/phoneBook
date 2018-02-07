import java.util.ArrayList;
import java.util.Iterator;

/**
 * Represents a phone book that represents a collection of people (persons).
 *
 * @author Espen
 * @version 2018-02-07
 */

public class PhoneBook {
    private ArrayList<Person> persons;

    /**
     * Constructor for objects of class PhoneBook.
     */
    public PhoneBook() {
        this.persons = new ArrayList<Person>();
    }

    /**
     * Add a person to the phone book.
     * @param person The person to add to the phone book.
     */
    public void addPerson(Person person) {
        this.persons.add(person);
    }

    /**
     * Print a list of all names and phone numbers in the phone book.
     */
    public void printList() {
        for (Person p : this.persons) {
            System.out.println(p.getInfoAsString());
        }
    }

    /**
     * Find and return person by name.
     * @param name The name of the person.
     * @return The found person or null.
     */
    public Person getPersonByName(String name) {
        Person foundPerson = null;
        Iterator<Person> it = this.persons.iterator();
        while ((null == foundPerson) && (it.hasNext())) {
            Person p = it.next();
            if (p.getName().equalsIgnoreCase(name)) {
                foundPerson = p;
            }
        }
        return foundPerson;
    }
}
