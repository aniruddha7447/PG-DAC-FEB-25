package Practice;

import java.util.LinkedList;

public class linkedlist1 {
	public static class Node{
		int data;
		Node next;

	public Node(int data) {
		this.data = data;
		this.next = null;
	}
	 
	public static Node head;
	public static Node tail;
	
	public void addfirst(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = tail = newNode;
			return;
		}
		newNode.next = head;
		head = newNode;
	}
		
	}

	public static void main(String[] args) {
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.addFirst(5);
		ll.addFirst(4);
		ll.addFirst(3);
		ll.addFirst(2);
		ll.addFirst(1);
		System.out.println(ll);
	}

}
