package org.manjunath.datastructures.linkedlist;

public class IntegerLinkedList {
	
	class LinkedList {
		private Node first;
		private Node current;
		
		public LinkedList(){
			first = null;
			current = null;
		}
		
		/**
		 * insert method inserts the data at rear end of the linked list
		 * 
		 * @param data Integer Data
		 */
		public void insert(int data) {
			Node newNode = new Node(data);
			
			if (first == null) {
				first = newNode;
				current = newNode;
			} else {
				current.next = newNode;
				current = newNode;
			}
		}
		
		/**
		 * insertFront method inserts the data at front end of the linked list
		 * 
		 * @param data Integer data
		 */
		public void insertFront(int data) {
			Node newNode = new Node(data);
			
			if (first == null) {
				first = newNode;
				current = newNode;
			} else {
				newNode.next = first;
				first = newNode;
			}
		}
		
		/**
		 * delete method deletes the data at the rear end
		 */
		public void delete() {
			Node temp1 = first;
			Node temp2 = null;

			Node deletedNode = null;
			if (first == null) {

			} else if (first.next == null) {
				deletedNode = first;
				first = null;
			} else {
				while (temp1.next != null) {
					temp2 = temp1;
					temp1 = temp1.next;
				}

				deletedNode = temp1;
				temp2.next = null;
				temp1 = null;
			}
			
			System.out.println(deletedNode);
		}
		
		public void display(){
			Node temp = first;
			while (temp != null){
				System.out.println(temp +" ");
				temp = temp.next;
			}
		}
		
	}
	
	public static class Node {
		private int data;
		private Node next;
		
		public Node(int data) {
			this.data = data;
		}
		
		public int data() {
			return data;
		}
		
		public void setData(int data) {
			this.data = data;
		}
		
		public Node next(){
			return next;
		}
		
		public void setNode(Node next) {
			this.next = next;
		}
		
		@Override
		public String toString() {
			return ""+data;
		}
	}
	
	
	public static void main(String[] args) {
		LinkedList list = new IntegerLinkedList().new LinkedList();
		list.insert(10);
		list.insertFront(20);
		
		list.display();
		
		list.delete();
		
		list.display();
		
		list.delete();
		
		list.delete();
		
		list.display();
		
		list.insertFront(30);
		
		list.display();
		list.insert(40);
		list.insertFront(10);
		
		list.display();
	}
}
