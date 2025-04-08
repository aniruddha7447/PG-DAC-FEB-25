import java.util.*;

class MiniProject3{

		Node head;
	
	
	static class Node{
		String title;
		String artist;
		Node next;
		Node prev;
		
		
		Node(String title, String artist){
		this.title = title;
		this.artist = artist;
		this.next = null;
		this.prev = null;
	}
}
	
	
	void addSong(String title, String artist){
		Node new_node = new Node(title, artist);
		
		if(head == null){
			head = new_node;
			head.next = head;
			head.prev = head;
		}else{
			Node tail = head.prev;
			tail.next = new_node;
			new_node.prev = tail;
			new_node.next = head;
			head.prev = new_node;
		}
		System.out.println("Song added: " + title + " by " + artist);
		
	}
	
	
	void removeSong(String title) {
		
		Node preTemp = null;
		
		
		if(head == null){
			System.out.println("Playlist is empty.");
			return;
		}
		
		Node temp = head;
		if(temp.title.equalsIgnoreCase(title)){
			if(head.next == head){
				head = null;
			}else{
			head = head.next;
			head.prev = temp.prev;
			temp.prev.next = head;
			}
			System.out.println("Song removed: " + title);
			return;
		}
		
		
	
		temp = head.next;
		while(temp != head){
			if(temp.title.equalsIgnoreCase(title)){
			temp.prev.next = temp.next;
			temp.next.prev = temp.prev;
			System.out.println("Song removed: " + title);
			return;
		}
		temp = temp.next;
	
	}
	System.out.println("Song not found: " + title);
	
	}
	
	
	
	
	void playNext(){
		if(head != null && head.next != null){
			head = head.next;
			System.out.println("Now Playing: " + head.title + " by " + head.artist);
		}
	}
		
	void playPrevious(){
		if(head != null && head.prev != null){
			head = head.prev;
			System.out.println("Now Playing: " + head.title + " by " + head.artist);
		}
	}
		
	void displayCurrentSong(){
		if(head != null){
			System.out.println("Now Playing: " + head.title + " by " + head.artist);
		}else{
			System.out.println("No Songs");
		}
	}
	
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		MiniProject3 P3 = new MiniProject3(); 
		
		while(true){
			System.out.println("1. Add Song\n2. Remove Song\n3. Play Next Song\n4. Play Previous Song\n5. Display Current Song\n6. Exit");
			int choise = sc.nextInt();
			sc.nextLine();
			
			switch(choise){
				case 1:
				System.out.println("Enter Song Title : ");
                String title = sc.nextLine();
				
				System.out.println("Enter Artist Name : ");
                String artist = sc.nextLine();
				
				P3.addSong(title, artist);
				break;
				
				case 2:
				System.out.println("Enter Song Title : ");
                String titleRemove = sc.nextLine();
				
				P3.removeSong(titleRemove);
				break;
				
				case 3:
				P3.playNext();
				break;
				
				case 4:
				P3.playPrevious();
				break;
				
				case 5:
				P3.displayCurrentSong();
				break;
				
				case 6:
				System.out.println("Exiting...\nThankYou");
				return;
				
				default:
				System.out.println("Invalid choice, try again.");
				
				
			}
		}
	}
}
	
