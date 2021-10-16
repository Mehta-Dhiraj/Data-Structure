
public class Runner {

	public static void main(String[] args) {
		Queue q = new Queue();

		q.peek();
		q.dequed();
		q.enqueue(3);
		q.enqueue(9);
		q.enqueue(2);
		q.enqueue(11);
		q.enqueue(131);

		q.dequed();
		q.dequed();
		q.dequed();

		q.print();

	}

}
