package Practice;

import java.util.*;

public class LL_Cycle {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public static boolean isCycle() {
        // Floyd's algorithm
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }
    
    public static void RemoveCycle() {
    	//detect cycle
        Node slow = head;
        Node fast = head;
        boolean Cycle = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                Cycle = true;
                break;
            }
        }
        if(Cycle =  false) {
        	return;
        }
        //find meeting point
        Node prev = null;
        slow = head;
        while(slow!=fast) {
        	prev = fast;
        	slow=slow.next;
        	fast=fast.next;
        }
        //removing cycle
        prev.next = null;
        
    }

    public static void main(String[] args) {
        LL_Cycle ll = new LL_Cycle();
        head =  new Node(1);
        Node temp = new Node(2);
        head.next=temp;
        head.next.next=new Node (3);
        head.next.next.next=temp;
        //1-2-3-2
        
        System.out.println(isCycle());
        
        RemoveCycle();

        System.out.println(isCycle());
    }
}
