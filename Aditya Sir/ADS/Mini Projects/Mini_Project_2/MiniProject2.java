import java.util.*;

class MiniProject2{

	
	
	
	
static class History{	
	Node temp = null;
	Node head = null;

	static class Node{
		String url;
		Node prev;
		Node next;
		
		Node(String url){
			this.url = url;
			this.prev = null;
			this.next = null;
		}
	}



	
	void visitPage(String url){
		Node new_node = new Node(url);
		
		if(temp == null){
			head = new_node;
			temp = new_node;
		}else{
			new_node.prev = temp;
			temp.next = new_node;
			temp = new_node;
		}
		
	}
	
	
	void moveForward(){
		if(temp != null && temp.next != null){
			temp = temp.next;
			System.out.println(temp.url);
		}else{
			System.out.println("No Page in forward");
		}
	}
	
	
	
	void moveBackward(){
		
		if(temp != null && temp.prev != null){
			temp = temp.prev;
			System.out.println(temp.url);
		}else{
			System.out.println("No Page in backward");
		}
	}
	
	
	
	void clearHistory(){
		temp = null;
		System.out.println("History Deleted...!!!");
	}
	
	void displayCurrentPage(){
		if(temp != null){
			System.out.println(temp.url);
		}else{
			System.out.println("Visit First.");
		}
	}
	
	
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		History H1 = new History();
		
		while(true){
			System.out.println("1. Visit Page\n2. Current Page\n3. Clear History\n4. Exit");
			int choise = sc.nextInt();
			sc.nextLine();
			
			switch(choise){
				case 1:
				System.out.println("Enter the website you want to visit.");
				String url = sc.nextLine();				
				H1.visitPage(url);
				
				System.out.println("You are visiting " + url + ".");
				
				boolean x = true;
					while(x){
						System.out.println("1. go Forward\n2. go Backward\n3. Go Back to Main Menu");
						int newchoise = sc.nextInt();
						sc.nextLine();
						
						switch(newchoise){
							case 1:
							H1.moveForward();
							break;
							
							case 2:
							H1.moveBackward();
							break;
							
							case 3:
							x = false;
							break;
							
							default:
							System.out.println("Invalid choice, try again.");
						}
					}
					break;
				
				case 2:
				H1.displayCurrentPage();
				
				break;
				
				case 3:
				H1.clearHistory();
				
				break;
				
				case 4:
				System.out.println("Exiting...\nThankYou");
				return;
				
				default:
				System.out.println("Invalid choice, try again.");
				
			}
		}
		
	}
	
	
	
}