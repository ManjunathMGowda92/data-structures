package org.manjunath.datastructures.linkedlist;

/**
 * Class LengthOfSLL is used to find the length of LinkedList in single iteration.
 * 
 * 
 * @author Manjunath HM
 *
 */
public class LengthOfSLL {
	
	public static void main(String[] args) {
		LinkedList list = new LengthOfSLL().new LinkedList();
		list.insert("Manjunath");
		list.insert("Manoj");
		list.insert("Sushma");
		list.insert("Sagar");
		list.insert("Supritha");
		list.insert("Akshitha");
		list.insert("Megha");
		list.insert("Chethan");
		list.insert("Amrutha");
		list.insert("Amith");
		list.insert("Prajwal");
		list.insert("Gowtham");
		list.insert("Nayana");
		
		list.display();
		System.out.println(list.length());
	}
	
	class LinkedList{
		private Node first;
		private Node current;
		
		public LinkedList() {
			this.first = new Node("first");
			this.current = first;
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
			while (tempNode != null) {
				System.out.print(tempNode+" ");
				tempNode = tempNode.next;
			}
			System.out.println();
		}
		
		public int length(){
			Node tempNode = first.next;
			int length = 0;
			while (tempNode != null) {
				length++;
				tempNode = tempNode.next;
			}
			
			return length;
		}
	}
	
	public static class Node {
		private String data;
		private Node next;
		
		public Node(String data) {
			this.data = data;
		}
		
		public String data(){
			return data;
		}
		
		public void setData(String data) {
			this.data = data;
		}
		
		public Node next(){
			return next;
		}
		
		public void setNext(Node next) {
			this.next = next;
		}
		
		@Override
		public String toString() {
			return data;
		}
	}
}


