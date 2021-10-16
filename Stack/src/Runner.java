
public class Runner {

	public static void main(String[] args) {
		// Stack st = new Stack();
		LinkedStack st = new LinkedStack();

		st.push(7);
		st.push(21);
		st.push(12);
		st.push(90);
		st.push(37);
		st.show();

		System.out.println(">>>>>>>>>>><<<<<<<<<<");

		st.pop();
		st.show();
		System.out.println(">>>>>>>>>>><<<<<<<<<<");

		st.peek();

	}

}
