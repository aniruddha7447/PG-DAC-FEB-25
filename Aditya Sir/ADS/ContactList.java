class Contact {
    String name;
    String phone;
    Contact next;

    public Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
        this.next = null;
    }
}

class ContactList {
    private Contact head;

    public void addContact(String name, String phone, boolean atEnd) {
        Contact newContact = new Contact(name, phone);
        if (head == null) {
            head = newContact;
            System.out.println("Contact added: " + name + ", " + phone);
            return;
        }
        if (!atEnd) {
            newContact.next = head;
            head = newContact;
        } else {
            Contact temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newContact;
        }
        System.out.println("Contact added: " + name + ", " + phone);
    }
	public void displayContacts() {
        if (head == null) {
            System.out.println("Contact list is empty.");
            return;
        }
        System.out.println("Contact List:");
        Contact temp = head;
        while (temp != null) {
            System.out.println(temp.name + ", " + temp.phone);
            temp = temp.next;
        }
    }
}
public class Main {
	
    public static void main(String[] args) {
        ContactList contactList = new ContactList();
        contactList.addContact("Aditya Kansana", "9425760166", true);
        contactList.addContact("Rahul Sharma", "9876543210", false);
        contactList.displayContacts();
    }
}
