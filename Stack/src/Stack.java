
public class Stack {

	private final int N = 10;

	private int stack[] = new int[N];

	private int top = -1;

	public void push(int item) {
		if (top == N - 1) {
			System.out.println("Stack is Overflow");
			return;
		} else {
			top++;
			stack[top] = item;
		}
	}

	public void pop() {
		if (isEmpty()) {
			System.out.println("Stack is UnderFlow");
		} else {
			top--;
		}
	}
	
	public void display() {
		for(int i=top; i>=0;i--) {
			System.out.println(stack[i]);
		}
	}

	public boolean isEmpty() {
		if (top == -1) {
			return true;
		}
		return false;
	}

	public void peek() {
		if (isEmpty()) {
			System.out.println("Stack is Empty");
		} else {
			System.out.println(stack[top]);
		}
	}

}
