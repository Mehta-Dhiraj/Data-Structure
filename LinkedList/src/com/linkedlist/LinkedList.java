package com.linkedlist;

public class LinkedList {

	// Head Node
	private Node head = null;

	// Inserting data at last
	public void insert(int data) {
		Node node = new Node();

		node.setData(data);
		node.setNext(null);

		if (head == null) {
			head = node;
		} else {
			Node n = head;
			while (n.getNext() != null) {
				n = n.getNext();
			}
			n.setNext(node);
		}
	}

	// Inserting data at particular position
	public void insertAt(int index, int data) {
		Node node = new Node();

		node.setData(data);
		node.setNext(null);

		if (index == 0) {
			insertAtStart(data);
		} else {

			Node n = head;
			for (int i = 0; i < index - 1; i++) {
				n = n.getNext();
			}
			node.setNext(n.getNext());
			n.setNext(node);
		}

	}

	// Printing all data
	public void show() {
		Node node = head;

		while (node.getNext() != null) {
			System.out.println(node.getData());
			node = node.getNext();
		}
		System.out.println(node.getData());
	}

	// Delete data at index
	public void delete(int index) {
		if (index == 0) {
			head = head.getNext();
		} else {
			Node n = head;
			Node n1 = null;
			for (int i = 0; i < index - 1; i++) {
				n = n.getNext();
			}
			n1 = n.getNext();
			n.setNext(n1.getNext());
		}

	}

	// Inserting data at Start
	public void insertAtStart(int data) {

		Node node = new Node();
		node.setData(data);
		node.setNext(null);

		node.setNext(head);
		head = node;

	}

	public int length() {
		Node node = head;
		int count = 0;
		while (node.getNext() != null) {
			count++;
			node = node.getNext();
		}
		return count + 1;
	}

}
