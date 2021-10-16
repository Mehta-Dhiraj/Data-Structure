package com.queue;
public class Queue {

	private int size = 5;
	private int front = -1;
	private int rear = -1;
	private int queue[] = new int[size];

	public void enqueue(int data) {
		if (front == -1 && rear == -1) {
			front = rear = 0;
			queue[rear] = data;
		} else if (rear == size - 1) {
			System.out.println("Sorry!! Queue is full");
		} else {
			rear++;
			queue[rear] = data;
		}
	}

	public void dequed() {
		if (front == -1 && rear == -1) {
			System.out.println("Sorry!! No data is available to delete");
		} else if (front == rear) {
			System.out.println("Deleted item from Queue: " + queue[front]);
			front = rear = -1;

		} else {
			System.out.println("Deleted item from Queue: " + queue[front]);
			front++;
		}
	}

	public void print() {
		if (front == -1 && rear == -1) {
			System.out.println("Sorry!! No data is available to print");
		} else {
			System.out.print("[");
			for (int i = front; i < rear; i++) {

				System.out.print(queue[i] + ",");

			}
			System.out.print(queue[rear] + "]");
		}

	}

	public void peek() {
		if (front == -1 && rear == -1) {
			System.out.println("Underflow condition!!");
		}else {
			System.out.println("\n" + queue[front]);
		}
		
	}
}
