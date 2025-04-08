import java.util.*;

class MiniProject1{
	
	Node start;
	
	static class Node{
		String name, phone;
		Node next;
		
		Node(String name, String phone){
			this.name = name;
			this.phone = phone;
			this.next = null;
		}
	}
	
	void addContact(String name, String phone){
		Node new_node = new Node(name, phone);
		
		if(start == null){
			start = new_node;
		}else{
			new_node.next = start;
			start = new_node;
		}
	
	}
	
	
	void removeContact(String name){
		
		if(start == null){
			System.out.println("No contacts available.");
			return;
		}
		
		Node temp = start, pre = null;
		if(start.name.equals(name)){
			start = temp.next;
			System.out.println("Contact removed: " + name);
			return;
		}
		while(temp != null && !temp.name.equals(name)){
			pre = temp;
			temp = temp.next;
		}
		if(temp == null){
			System.out.println("Contact not found.");
			return;
		}
		pre.next = temp.next;
		System.out.println("Contact removed: " + name);
		
	}
	
	
	void searchContact(String name){
		boolean found = false;
		Node temp = start;
		while(temp != null){
			if(temp.name.equals(name)){
				System.out.println("Contact found: " + temp.name + ", " + temp.phone);
			found = true;
			break;
			}
			temp = temp.next;
		}
		if(!found){
		System.out.println("Contact not found.");
		}
	}
	
	
	
	
	
	void displayContacts(){
		Node temp = start;
		
		if(temp == null){
			System.out.println("No Contacts, Please add your Contacts.");
		}else{
		System.out.println("Contact List:");
		while(temp != null){
			System.out.println(temp.name + "," + temp.phone);
			temp = temp.next;
		}
		
		
		} 
	}

	
	
	
	
	
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		MiniProject1 M1 = new MiniProject1();

		while(true){
			System.out.println("1. Add Contact\n2. Remove Contact\n3. Search Contact\n4. Display Contacts\n5. Exit");
			int choice = sc.nextInt(); 
			sc.nextLine(); 
			
			switch(choice){
				case 1:
				System.out.println("Enter name : ");
                String name = sc.nextLine();
				
				System.out.println("Enter Phone Number : ");
                String phone = sc.nextLine();
				
				M1.addContact(name, phone);
				System.out.println("Contact added: " + name + ", " + phone);
				
				break;
				
				case 2:
				System.out.print("Enter name : ");
                String name1 = sc.nextLine();
				
				M1.removeContact(name1);
				
				break;
				
				case 3:
				System.out.print("Enter name : ");
				String name2 = sc.nextLine();
				
				M1.searchContact(name2);
				break;
				
				case 4:
				M1.displayContacts();
				break;
				
				case 5:
				System.out.println("Exiting...\nThankYou");
				return;
				
				default:
				System.out.println("Invalid choice, try again.");
				
			}
			
		}


	}
	
	
	
}