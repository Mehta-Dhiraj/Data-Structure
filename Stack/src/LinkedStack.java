
public class LinkedStack {
	
	Node top;
	
	
	public void push(int item) {
		Node node = new Node();
		
		node.data = item;
		node.next = top;
		
		top=node;
	}
	
	public void show() {
		Node temp = top;
		
		if(top == null) {
			System.out.println("Stack is Empty");
		}else {
			while(temp != null) {
				System.out.println(temp.data);
				temp=temp.next;
			}
			//System.out.println(temp.next);
		}
	}
	
	public void peek() {
		if(top == null) {
			System.out.println("Stack is Empty");
		}else {
			
				System.out.println(top.data);
				
			}
	}
	
	public void pop() {
		if(top == null) {
			System.out.println("Stack is Empty");
		}else {
			
				top=top.next;
				
			}
	}

}
