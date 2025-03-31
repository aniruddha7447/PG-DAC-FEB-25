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
    
    public static void main(String args[]){
		ContactList L = new ContactList();
		L.addContact("Aditya Kansana", "9425760166");
		L.addContact("Aniruddha", "7447653314");
		L.addContact("Amol", "7261910026");
		L.displayContacts();
		System.out.println("\n");
		
		L.removeContact("Aditya Kansana");
		L.displayContacts();
		System.out.println("\n");
		
		L.searchContact("Aniruddha");
		L.displayContacts();
		System.out.println("\n");
    }
}
