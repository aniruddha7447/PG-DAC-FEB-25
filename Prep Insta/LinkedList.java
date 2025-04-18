package Practice;

public class LinkedList {
	//Creation of node class
	public static class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data=data;
			this.next=null;
			
		}
	}
	
	public static Node head;
	public static Node tail;
	public static int size;
	
	
	//Adding in First of linked list
	public void AddFirst(int data) {
		//S1 = create new node
		Node newNode = new Node(data);
		size++;
		if(head == null) {
			head = tail = newNode;
			return;
		}
		
		//S2 = newNode next = head
		newNode.next=head;
		
		//S3 = head = newNode
		head = newNode;
	}
	
	
	//Adding in last
	public void AddLast(int data) {
	
		//create new node
		Node newNode = new Node(data);
		size++;
	
		//tail.next = newNode
		if (head == null) {
			head= tail=newNode; 
			return;
		}
		tail.next=newNode;
		
		//tail = newNode
		tail = newNode;	
	}
	
	
	
	//Adding Elements in Middle of linked list
	public void addMid(int idx, int data  ) {
		if(idx==0) {
			AddFirst(data);
			return;
		}
		Node newNode = new Node(data);
		size++;
		Node temp = head;
		int i = 0;
		
		while (i<idx-1) {
			temp = temp.next;
			i++;
		}
	
		//i= idx-1 ; temp-> prev;
		newNode.next=temp.next;
		temp.next=newNode;
	}
	
	
	//For removing the elements
	
	public int removeFirst() {
		 if(size==0) {
			 System.out.println("LL is Empty");
			 return Integer.MIN_VALUE;
		 }else if(size==1) {
			 int val=head.data;
			 head=tail=null;
			 size=0;
			 return val;
		 }
		 int val= head.data;
		 head = head.next;
		 size--;
		 return val;
	}
	
	
	//While removing the nodes size will be change so while performing add addfirst addlast
	//operations size changed every time
	
	public int removelast() {
		if(size==0) {
			 System.out.println("LL is Empty");
			 return Integer.MIN_VALUE;
		 }else if(size==1) {
			 int val=head.data;
			 head=tail=null;
			 size=0;
			 return val;
	}

		
		//here need to find prev node of tail
		//prev : i = size-2
		 
		Node prev = head;
		for(int i=0;i<size-2;i++) {
			prev = prev.next;
		}
		
		int val = prev.next.data;//which is tail ka data
		prev.next= null;
		tail=prev;
		size--;
		return val;
	}
	
	
	
	///Recursive approach
	///Recursion problem 
	///Find Key element in ll
	///to get the idx of i/p key
	
	
	public int helper(Node head,int key) {
		if(head==null) {
			return -1;
		}if(head.data==key) {
			return 0;
		}
		int idx = helper(head.next,key);
		if(idx == -1) {
			return -1;
		}
		return idx+1;
	}
	public int recursearch(int key) {
		return helper  (head,key);
	}
	
	//{Printing the size of LinkedList
	
	public void Size() {
		int sz=0;
		Node temp = head;
		while(temp != null) {
			temp = temp.next;
			sz++;
		}
		System.out.println(sz);
	}
	
	//For printing the linked list
	public static void printll() {
		if (head == null) {
			System.out.println("Linked list is Empty");
			return; 
		}
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
		System.out.println();
	}
	//main method
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.printll();
		ll.AddFirst(2);
		ll.printll();
		ll.AddFirst(1);
		ll.printll(); 
		ll.AddLast(3);
		ll.printll();
		ll.AddLast(4);
		ll.printll();
		//ll.addMid(0,9);
		//ll.printll();
		
		//System.out.println("Size of LL is " + ll.size);----->This size is inbuilt fn which is in java
		//ll.removeFirst();
		
		//ll.size();
		//ll.printll();//9 will be removed
		//ll.removelast();
		//ll.printll();//4 will be removed
		
		//System.out.println(ll.recursearch(3));
		//System.out.println(ll.recursearch(10));
		//ll.Size(); ------>This Size is a function which is manually created
		
	}

}
