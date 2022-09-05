package queue;

public class Main {
	public static void main(String[] args) {
		Queue list = new Queue(45);
		list.enqueue(56);
		list.enqueue(29);
		
		list.printQueue();
		
		System.out.println(list.dequeue().value);
		
		list.printQueue();
	}
}
