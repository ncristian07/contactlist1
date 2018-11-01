package contactList;

import contactList.Contact;

import java.util.HashSet;
import java.util.Set;

public class ContactGroup {

    Set<Contact> contactGroup;

    public ContactGroup() {
        contactGroup = new HashSet<>();
    }
}