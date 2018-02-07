/**
 * Represents a single person, holding information about the name and the phone number of that person.
 *
 * @author Espen
 * @version 2018-02-07
 */

public class Person {
    private String name;
    private String phoneNumber;

    /**
     * Constructor for person.
     * @param name The persons first and last name.
     * @param phoneNumber The persons phone number.
     */
    public Person(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    /**
     * Constructor for person.
     * @param name The persons first and last name.
     */
    public Person(String name) {
        this.name = name;
    }

    /**
     * Returns the persons first and last name.
     * @return The persons first and last name.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the persons first and last name.
     * @param name The persons first and last name.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the persons phone number.
     * @return The persons phone number.
     */
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    /**
     * Set the persons phone number.
     * @param phoneNumber The persons phone number.
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * Returns the persons name and phone number as a formatted string.
     * @return The persons name and phone number as a formatted string.
     */
    public String getInfoAsString() {
        return this.name + ": " + this.phoneNumber;
    }
}
