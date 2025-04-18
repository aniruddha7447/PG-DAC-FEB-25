package Practice;

import java.util.*;

class ContactManager {
    
    private static class Node {
        String name, phone;
        Node next;
        
        Node(String name, String phone) {
            this.name = name;
            this.phone = phone;
            this.next = null;
        }
    }
    
    private Node head;
    
    public void addContact(String name, String phone) {
        if (isDuplicate(name)) {
            System.out.println("Contact already exists!");
            return;
        }
        Node newNode = new Node(name, phone);
        newNode.next = head;
        head = newNode;
        System.out.println("Contact added: " + name + ", " + phone);
    }
    
    private boolean isDuplicate(String name) {
        Node temp = head;
        while (temp != null) {
            if (temp.name.equalsIgnoreCase(name)) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
    
    public void removeContact(String name) {
        if (head == null) {
            System.out.println("No contacts available.");
            return;
        }
        
        if (head.name.equalsIgnoreCase(name)) {
            head = head.next;
            System.out.println("Contact removed: " + name);
            return;
        }
        
        Node temp = head, prev = null;
        while (temp != null && !temp.name.equalsIgnoreCase(name)) {
            prev = temp;
            temp = temp.next;
        }
        
        if (temp == null) {
            System.out.println("Contact not found.");
            return;
        }
        
        prev.next = temp.next;
        System.out.println("Contact removed: " + name);
    }
    
    public void searchContact(String name) {
        Node temp = head;
        while (temp != null) {
            if (temp.name.equalsIgnoreCase(name)) {
                System.out.println("Contact found: " + temp.name + ", " + temp.phone);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Contact not found.");
    }
    
    public void displayContacts() {
        if (head == null) {
            System.out.println("No Contacts, Please add your Contacts.");
            return;
        }
        System.out.println("Contact List:");
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.name + " : " + temp.phone);
            temp = temp.next;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContactManager cm = new ContactManager();
        
        while (true) {
            System.out.println("\n1. Add Contact\n2. Remove Contact\n3. Search Contact\n4. Display Contacts\n5. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();
            
            switch (choice) {
                case 1:
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Phone Number: ");
                    String phone = sc.nextLine();
                    cm.addContact(name, phone);
                    break;
                case 2:
                    System.out.print("Enter Name to Remove: ");
                    String nameToRemove = sc.nextLine();
                    cm.removeContact(nameToRemove);
                    break;
                case 3:
                    System.out.print("Enter Name to Search: ");
                    String nameToSearch = sc.nextLine();
                    cm.searchContact(nameToSearch);
                    break;
                case 4:
                    cm.displayContacts();
                    break;
                case 5:
                    System.out.println("Exiting... Thank You!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice, try again.");
            }
        }
    }
}
