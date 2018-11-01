package contactList;

import java.util.Scanner;

public class ContactList {
    public static void main(String[] args) {

        PhoneBook phonebook = new PhoneBook();
        Scanner scan = new Scanner(System.in);
        boolean ok = false;
        do {
            phonebook.showMenu();
            int option = scan.nextInt();

        }
        while (!ok);


    }


}