package linkedList;

public class DoublyList implements LinkedList {

	private Dnode head;
	private Dnode tail;
	private int size;

	@Override
	public void addFirst(Emp e) {
		Dnode node = new Dnode(e);
		node.setNext(this.head);
		if (this.head == null) {
			this.tail = node;
		} else {
			this.head.setPrevious(node);
		}
		this.head = node;
		size++;
	}

	@Override
	public void addLast(Emp e) {
		// TODO Auto-generated method stub

	}

	@Override
	public int size() {
		return this.size;
	}

	@Override
	public boolean isEmpty() {
		return this.head == null;
	}

	@Override
	public Emp deleteFirst() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Emp deleteLast() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Emp delete(Emp e) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void show() {
		Dnode node = this.head;
		while (node.getNext() != null) {
			System.out.print(node.getData().toString());
			System.out.print(" <=> ");
			node = node.getNext();
		}
		System.out.println();
	}

}
