package binarySearchTree;

public class BinarySearchTree<T extends Comparable<T>> implements Tree<T> {

	private Node<T> root;

	@Override
	public void add(T data) {
		if (this.root == null) {
			this.root = new Node<T>(data);
		} else {
			add(data, this.root);
		}
	}

	private void add(T data, Node<T> node) {
		if (data.compareTo(node.getData()) < 0) {
			if (node.getLeftChild() == null) {
				Node<T> leftNode = new Node<T>(data);
				node.setLeftChild(leftNode);
			} else {
				add(data, node.getLeftChild());
			}
		} else {
			if (node.getRightChild() == null) {
				Node<T> rightNode = new Node<T>(data);
				node.setRightChild(rightNode);
			} else {
				add(data, node.getRightChild());
			}
		}
	}

	@Override
	public void inorderShowAll() {
		if (this.root != null) {
			inorder(this.root);
		}
	}

	private void inorder(Node<T> node) {
		if (node.getLeftChild() != null) {
			inorder(node.getLeftChild());
		}
		System.out.print(node + " --> ");
		if (node.getRightChild() != null) {
			inorder(node.getRightChild());
		}
	}

	@Override
	public void delete(T data) {
		if (this.root != null) {
			this.root = delete(data, this.root);
		}
	}

	private Node<T> delete(T data, Node<T> node) {
		if (node == null) {
			return node;
		}
		if (data.compareTo(node.getData()) < 0) {
			node.setLeftChild(delete(data, node.getLeftChild()));
		} else if (data.compareTo(node.getData()) > 0) {
			node.setRightChild(delete(data, node.getRightChild()));
		} else {
			/* delete leaf node */
			if (node.getLeftChild() == null && node.getRightChild() == null) {
				System.out.println("Deleting leaf node!");
				return null;
			} else if (node.getLeftChild() == null) {
				/* delete node have single child */
				System.out.println("Deleting single right child node!");
				Node<T> temp = node.getRightChild();
				node = null;
				return temp;
			} else if (node.getRightChild() == null) {
				/* delete node have single child */
				System.out.println("Deleting single left child node!");
				Node<T> temp = node.getLeftChild();
				node = null;
				return temp;
			}
			/* delete node have 2 child */
			Node<T> temp = getPredecessor(node.getLeftChild());
			node.setData(temp.getData());
			node.setLeftChild(delete(temp.getData(), node.getLeftChild()));
		}
		return node;
	}

	private Node<T> getPredecessor(Node<T> node) {
		return node.getRightChild() != null ? getPredecessor(node.getRightChild()) : null;
	}

	@Override
	public T getMax() {
		return this.root != null ? getMaxValue(this.root) : null;
	}

	private T getMaxValue(Node<T> node) {
		return node.getRightChild() != null ? getMaxValue(node.getRightChild()) : node.getData();
	}

	@Override
	public T getMin() {
		return this.root != null ? getMinValue(this.root) : null;
	}

	private T getMinValue(Node<T> node) {
		return node.getLeftChild() != null ? getMinValue(node.getLeftChild()) : node.getData();
	}

	@Override
	public void preorderShowAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void postorderShowAll() {
		// TODO Auto-generated method stub
		
	}

}
