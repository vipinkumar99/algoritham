package linkedList;

public class SinglyList implements LinkedList {

	private Enode head;
	private int size;

	@Override
	public void addFirst(Emp e) {
		Enode node = new Enode(e);
		node.setNext(head);
		this.head = node;
		size++;
	}

	@Override
	public void addLast(Emp e) {
		if (this.head == null) {
			addFirst(e);
		} else {
			Enode last = this.head;
			while (last.getNext() != null) {
				last = last.getNext();
			}
			Enode node = new Enode(e);
			last.setNext(node);
			size++;
		}
	}

	@Override
	public int size() {
		return this.size;
	}

	@Override
	public boolean isEmpty() {
		return head == null;
	}

	@Override
	public Emp deleteFirst() {
		if (this.head == null) {
			return null;
		} else {
			Enode node = this.head;
			this.head = this.head.getNext();
			size--;
			node.setNext(null);
			return node.getData();
		}
	}

	@Override
	public Emp deleteLast() {
		if (this.head == null) {
			return null;
		} else {
			Enode last = this.head;
			while (last.getNext().getNext() != null) {
				last = last.getNext();
			}
			Enode node = last.getNext();
			size--;
			last.setNext(null);
			return node.getData();
		}
	}

	@Override
	public void show() {
		Enode head = this.head;
		while (head != null) {
			System.out.print(head.getData().toString());
			System.out.print(" --> ");
			head = head.getNext();
		}
		System.out.println();
	}

	@Override
	public Emp delete(Emp e) {
		if (this.head == null) {
			return null;
		}
		Enode node = this.head;
		Enode previous = node;
		while (node.getNext() != null) {
			if (node.getData().equals(e)) {
				previous = node;
				break;
			}
			node = node.getNext();
		}
	
		return null;
	}

}
