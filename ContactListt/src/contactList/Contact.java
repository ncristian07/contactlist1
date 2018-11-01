package contactList;

import java.util.Objects;
import java.util.Set;

public class Contact implements Comparable<Contact>{

    private String firstName;
    private String lastName;
    private Set<PhoneNumber> numbersList;


    public Contact(String firstName, String lastName, Set<PhoneNumber> numbersList) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.numbersList = numbersList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return Objects.equals(firstName, contact.firstName) &&
                Objects.equals(lastName, contact.lastName) &&
                Objects.equals(numbersList, contact.numbersList);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Set<PhoneNumber> getNumbersList() {
        return numbersList;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, numbersList);
    }

    @Override
    public int compareTo(Contact other) {
        int lastNameCompare = this.lastName.compareTo(other.lastName);
        if (lastNameCompare==0){
            return lastNameCompare;
        }
        int firstNameCompare = this.firstName.compareTo(other.firstName);
        if (firstNameCompare == 0){
            return firstNameCompare;
        }
        return lastNameCompare;
    }
}
