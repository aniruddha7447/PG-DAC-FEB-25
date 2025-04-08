

class DLL{
	Node head;
	
	static class Node{
		int data;
		Node prev;
		Node next;
		
		Node(int d){
			data = d;
			prev = null;
			next = null;
		}
	}
	
	
	void insert(int new_data){
		Node new_node = new Node(new_data);
		new_node.next = head;
		new_node.prev = null;
		if(head != null) 
			head.prev = new_node;
		
		head = new_node;
	}
	
	 void display(Node n){
		Node p = null;
		
		System.out.println("Forward traversal:");
		while( n != null)
		{
			System.out.print(n.data+"-->");
			p=n;
			n=n.next;
		}
		System.out.println();
		System.out.println("Backward traversal:");
		while( p != null)
		{
			System.out.print(p.data+"-->");
			p = p.prev;
		}
		
	} 
	
	void insertAfter(Node prev, int new_data){
		
		if(prev == null)
		{
			return;
		}
		Node new_node = new Node(new_data);
		new_node.next = prev.next;//Important
		prev.next = new_node;
		new_node.prev = prev;
		new_node.next.prev = new_node;
		
			
	}
	
		void append(int new_data){
		
		
		Node new_node = new Node(new_data);
		Node n = head;
		new_node.next = null;
		
		//Empty DLL next
		if(head == null){
			new_node.prev = null;
			head = new_node;
			return;
		}
		while(n.next != null){
			n=n.next;
		}
		n.next = new_node;
		new_node.prev = n;
		
		
		
	}
	
	public static void main(String[] args) {
		
		DLL d1  = new DLL();
		d1.head=null;
		//d1.display(d1.head.next);
		System.out.println();
		d1.insert(30);
		d1.insert(20);
		d1.insert(10);
		//d1.display(d1.head.next);
		System.out.println();
		d1.insert(5);
		//d1.display(d1.head);
		System.out.println();
		d1.insertAfter(d1.head.next, 17);
		//d1.display(d1.head);
		
		d1.append(50);
		d1.display(d1.head);
		
		
		
		
		
		
		
	}		
}