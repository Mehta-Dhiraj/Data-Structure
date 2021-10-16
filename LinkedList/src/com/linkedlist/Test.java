package com.linkedlist;

public class Test {

	public static void main(String[] args) {

		LinkedList list = new LinkedList();

		list.insert(2);
		list.insert(13);
		list.insert(23);
		list.insert(90);
		list.insert(36);
		list.insertAtStart(22);
		list.insertAtStart(101);
		
		list.insertAt(2, 202);
		list.insertAt(5, 202);
		
		//list.delete(1);

		//list.show();
		System.out.println(list.length());

	}

}
