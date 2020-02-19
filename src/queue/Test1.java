package queue;

public class Test1 {

	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedListQueue<>();
		System.out.println("isEmpty() : " + queue.isEmpty());
		queue.enqueue(12);
		queue.enqueue(14);
		queue.enqueue(16);
		queue.enqueue(18);
		System.out.println("isEmpty() : " + queue.isEmpty());
		System.out.println(queue.element());
		System.out.println("size : " + queue.size());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
	}

}
