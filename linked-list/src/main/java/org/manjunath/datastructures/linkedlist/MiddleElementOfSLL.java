package org.manjunath.datastructures.linkedlist;

/**
 * Class MiddleElementOfSLL is for finding the middle element of Singly Linked
 * List by one pass.
 * <br>
 * 
 * <b>Problem:</b> How to find middle element of a singly linked list in one pass?
 * <br>
 * 
 * <b>Solution:</b> We are using the two pointer approach to solve this problem. In the
 * two pointer approach, you have two pointers, fast and slow. In each step, the
 * fast pointer moves two nodes, while slow pointer just steps one node. So,
 * when fast pointer will point to the last node i.e. where next node is null,
 * the slow pointer will be pointing to the middle node of the linked list
 * 
 * @author Manjunath
 *
 */
public class MiddleElementOfSLL {
	
	public static void main(String[] args) {
		LinkedList l =  new LinkedList();
		
		//l.insert("10");
		//l.insert("20");
		//l.insert("30");
		//l.insert("40");
		
		l.display();
		
		findMidElementOfLL(l);
	}
	
	
	public static void findMidElementOfLL(LinkedList list) {
		//get the head or first of LinkedList
		LinkedList.Node current = list.head();
		
		int length = 0;
		LinkedList.Node middle = list.head();
		
		while(current.next() != null) {
			length++;
			if (length % 2 == 0)
				middle = middle.next();
			
			current = current.next();
		}
		
		if (length % 2 == 1)
			middle = middle.next();
		
		
		System.out.println(length);
		System.out.println(middle);
	}
}

class LinkedList{
	private Node first;
	private Node current;
	
	public LinkedList() {
		this.first = new Node("first");
		current = first;
	}
	
	public Node head(){
		return first;
	}
	
	public void insert(String data) {
		Node newNode = new Node(data);
		current.next = newNode;
		current = newNode;
	}
	
	public void display(){
		Node tempNode = first.next;
		while(tempNode != null) {
			System.out.print(tempNode+ " ");
			tempNode = tempNode.next;
		}
		System.out.println();
	}
	
	public static class Node {
		private String data;
		private Node next;
		
		public Node(String data) {
			this.data = data;
		}
		
		public String data() {
			return data;
		}
		
		public void setData(String data) {
			this.data = data;
		}
		
		public Node next() {
			return next;
		}
		
		public void setNext(Node next) {
			this.next = next;
		}
		
		@Override
		public String toString() {
			return this.data;
		}
	}
}


