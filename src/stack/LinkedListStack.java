package stack;

public class LinkedListStack<T extends Comparable<T>> implements Stack<T> {

	private int size;
	private Node<T> root;

	// O(1)
	@Override
	public void push(T data) {
		this.size++;
		if (this.root == null) {
			this.root = new Node<>(data);
		} else {
			Node<T> oldNode = this.root;
			this.root = new Node<>(data);
			this.root.setNextNode(oldNode);
		}
	}

	// O(1)
	@Override
	public T pop() {
		T data = this.root.getData();
		this.root = this.root.getNextNode();
		size--;
		return data;
	}

	@Override
	public T peek() {
		return this.root.getData();
	}

	// O(1)
	@Override
	public int size() {
		return this.size;
	}

	@Override
	public boolean isEmpty() {
		return this.root == null;
	}

}
