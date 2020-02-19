package linkedList;

public class SingleLinkedList<T extends Comparable<T>> implements List<T> {

	private Node<T> root;
	private int size;

	@Override
	public void add(T data) {
		++this.size;
		if (root == null) {
			this.root = new Node<>(data);
		} else {
			addAtStart(data);
		}
	}

	// O(1)
	private void addAtStart(T data) {
		Node<T> node = new Node<>(data);
		node.setNextNode(root);
		this.root = node;
	}

	// O(N)
	private void addAtLast(T data, Node<T> node) {
		if (node.getNextNode() != null) {
			addAtLast(data, node.getNextNode());
		} else {
			Node<T> newNode = new Node<>(data);
			node.setNextNode(newNode);
		}
	}

	@Override
	public void delete(T data) {
		if (this.root == null) {
			return;
		}
		--this.size;
		if (this.root.getData().compareTo(data) == 0) {
			this.root = this.root.getNextNode();
		} else {
			delete(data, root, root.getNextNode());
		}
	}

	private void delete(T data, Node<T> previousNode, Node<T> actualNode) {
		while (actualNode != null) {
			if (actualNode.getData().compareTo(data) == 0) {
				previousNode.setNextNode(actualNode.getNextNode());
				actualNode = null;
				return;
			}
			previousNode = actualNode;
			actualNode = actualNode.getNextNode();
		}
	}

	@Override
	public int size() {
		return this.size;
	}

	@Override
	public void showAll() {
		if (this.root == null) {
			return;
		}
		Node<T> node = this.root;
		while (node != null) {
			System.out.print(node);
			node = node.getNextNode();
			if (node != null) {
				System.out.print(" -> ");
			}
		}
		System.out.println();
	}
}
