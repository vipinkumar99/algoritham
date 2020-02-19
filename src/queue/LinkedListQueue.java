package queue;

public class LinkedListQueue<T extends Comparable<T>> implements Queue<T> {

	private Node<T> firstNode;
	private Node<T> lastNode;
	private int size;

	@Override
	public boolean isEmpty() {
		return this.firstNode == null;
	}

	@Override
	public int size() {
		return this.size;
	}

	// O(1)
	@Override
	public void enqueue(T data) {
		this.size++;
		Node<T> oldLastNode = this.lastNode;
		this.lastNode = new Node<T>(data);
		this.lastNode.setNextNode(null);
		if (isEmpty()) {
			this.firstNode = this.lastNode;
		} else {
			oldLastNode.setNextNode(this.lastNode);
		}
	}

	// O(1)
	@Override
	public T dequeue() {
		this.size--;
		T data = this.firstNode.getData();
		this.firstNode = this.firstNode.getNextNode();
		if (isEmpty()) {
			this.lastNode = null;
		}
		return data;
	}

	@Override
	public T element() {
		return this.firstNode.getData();
	}

}
