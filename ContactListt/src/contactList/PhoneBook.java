package contactList;

import contactList.Contact;
import contactList.ContactGroup;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class PhoneBook {

    Map<String, ContactGroup> phonebookMap = new TreeMap<>();


    public void showMenu() {
        System.out.println("1.View all contacts.");
        System.out.println("2.Add contact.");
        System.out.println("3.Remove contact");
        System.out.println("4.Edit contact");
        System.out.println("5.Search contact");
        System.out.println("6.Quit");

        Scanner scan = new Scanner(System.in);

        int option = scan.nextInt();

        switch (option) {
            case 1: {
                showContacts();
                break;
            }
            case 2: {
                addContact();
                break;
            }
            case 3: {
                removeContact();
                break;
            }
            case 4: {
                editContact();
                break;
            }
            case 5: {
                searchContact();
            }
            case 0: {
                exit();
                break;
            }
        }
    }


    private void showContacts() {
        Set<Map.Entry<String, ContactGroup>> entryContact = phonebookMap.entrySet();
        for (Map.Entry<String, ContactGroup> addContact : entryContact) {
            System.out.println("Key: " + addContact.getKey() + ". Value: " + addContact.getValue());
        }
    }

    private void addContact(String fistName, String lastName, String operator, String type, String countryCodeType) {
        Contact contact1 = new Contact(fistName, lastName, new PhoneNumber())
    }

    private void removeContact() {
    }

    private void editContact() {
    }

    private void searchContact() {
    }

    private void exit() {

    }
}