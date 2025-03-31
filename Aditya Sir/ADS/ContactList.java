package AdityaSir;

import java.util.*;

class ContactList {
    
    Node start;
    
    static class Node {
        String name, phone;
        Node next;
        
        Node(String name, String phone) {
            this.name = name;
            this.phone = phone;
            this.next = null;
        }
    }
    
    void addContact(String name, String phone) {
        Node new_node = new Node(name, phone);
        
        if (start == null) {
            start = new_node;
        } else {
            new_node.next = start;
            start = new_node;
        }
        System.out.println("Contact added: " + name + ", " + phone);
    }
    
    void removeContact(String name) {
        if (start == null) {
            System.out.println("No contacts available.");
            return;
        }
        
        Node temp = start, pre = null;
        if (start.name.equalsIgnoreCase(name)) {
            start = temp.next;
            System.out.println("Contact removed: " + name);
            return;
        }
        while (temp != null && !temp.name.equalsIgnoreCase(name)) {
            pre = temp;
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Contact not found.");
            return;
        }
        pre.next = temp.next;
        System.out.println("Contact removed: " + name);
    }
    
    void searchContact(String name) {
        Node temp = start;
        while (temp != null) {
            if (temp.name.equalsIgnoreCase(name)) {
                System.out.println("Contact found: " + temp.name + ", " + temp.phone);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Contact not found.");
    }
    
    void displayContacts() {
        Node temp = start;
        
        if (temp == null) {
            System.out.println("No Contacts, Please add your Contacts.");
        } else {
            System.out.println("Contact List:");
            while (temp != null) {
                System.out.println(temp.name + ", " + temp.phone);
                temp = temp.next;
            }
        } 
    }
    
    public static void main(String args[]) {
        ContactList M1 = new ContactList();
        Scanner sc = new Scanner(System.in);

 
            System.out.println("1. Add Contact");
            System.out.println("2. Remove Contact");
            System.out.println("3. Search Contact");
            System.out.println("4. Display Contacts");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = sc.nextInt();
            sc.nextLine();  

            if (choice == 1) {
                System.out.print("Enter name: ");
                String name = sc.nextLine();
                System.out.print("Enter Phone Number: ");
                String phone = sc.nextLine();
                M1.addContact(name, phone);
            } 
            else if (choice == 2) {
                System.out.print("Enter name to remove: ");
                String name = sc.nextLine();
                M1.removeContact(name);
            } 
            else if (choice == 3) {
                System.out.print("Enter name to search: ");
                String name = sc.nextLine();
                M1.searchContact(name);
            } 
            else if (choice == 4) {
                M1.displayContacts();
            } 
            else if (choice == 5) {
                System.out.println("Exiting....Thank You!");
            } 
            else {
                System.out.println("Invalid choice, try again.");
            }
        }
}
