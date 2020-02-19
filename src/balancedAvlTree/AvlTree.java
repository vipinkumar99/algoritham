package balancedAvlTree;

public class AvlTree<T extends Comparable<T>> implements Tree<T> {

	private Node<T> root;

	@Override
	public void add(T data) {
		this.root = add(data, this.root);
	}

	private Node<T> add(T data, Node<T> node) {
		if (node == null) {
			return new Node<T>(data);
		}
		if (data.compareTo(node.getData()) < 0) {
			node.setLeftChild(add(data, node.getLeftChild()));
		} else {
			node.setRightChild(add(data, node.getRightChild()));
		}
		node.setHeight(Math.max(height(node.getLeftChild()), height(node.getRightChild()) + 1));
		node = settleViolation(data, node);
		return node;
	}

	private Node<T> settleViolation(T data, Node<T> node) {
		int balance = getBalance(node);
		// left-left situation
		if (balance > 1 && data.compareTo(node.getLeftChild().getData()) < 0) {
			return rightRotation(node);
		}
		// right-right situation
		if (balance < -1 && data.compareTo(node.getRightChild().getData()) > 0) {
			return leftRotation(node);
		}
		// left-right situation
		if (balance > 1 && data.compareTo(node.getLeftChild().getData()) > 0) {
			node.setLeftChild(leftRotation(node.getLeftChild()));
			return rightRotation(node);
		}
		// right-left situation
		if (balance < -1 && data.compareTo(node.getRightChild().getData()) < 0) {
			node.setRightChild(rightRotation(node.getRightChild()));
			return leftRotation(node);
		}
		return node;
	}

	private Node<T> rightRotation(Node<T> node) {
		System.out.println("Right Rotation - " + node);
		Node<T> tempLeft = node.getLeftChild();
		Node<T> tempRight = tempLeft.getRightChild();
		tempLeft.setRightChild(tempLeft);
		node.setLeftChild(tempRight);
		node.setHeight(Math.max(height(node.getLeftChild()), height(node.getRightChild()) + 1));
		tempLeft.setHeight(Math.max(height(tempLeft.getLeftChild()), height(tempLeft.getRightChild()) + 1));
		return tempLeft;
	}

	private Node<T> leftRotation(Node<T> node) {
		System.out.println("Left Rotation - " + node);
		Node<T> tempRight = node.getRightChild();
		Node<T> tempLeft = tempRight.getLeftChild();
		tempRight.setLeftChild(tempRight);
		node.setRightChild(tempLeft);
		node.setHeight(Math.max(height(node.getLeftChild()), height(node.getRightChild()) + 1));
		tempRight.setHeight(Math.max(height(tempRight.getLeftChild()), height(tempRight.getRightChild()) + 1));
		return tempRight;
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

	private int height(Node<T> node) {
		return node == null ? -1 : node.getHeight();
	}

	private int getBalance(Node<T> node) {
		return node == null ? 0 : (height(node.getLeftChild()) - height(node.getRightChild()));
	}

	@Override
	public void delete(T data) {
		if (this.root != null) {
			delete(data, this.root);
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
		node.setHeight(Math.max(height(node.getLeftChild()), height(node.getRightChild()) + 1));
		return settleDeletionViolation(node);
	}

	private Node<T> settleDeletionViolation(Node<T> node) {
		int balance = getBalance(node);
		// left-left situation
		if (balance > 1) {
			if (getBalance(node.getLeftChild()) < 0) {
				node.setLeftChild(leftRotation(node.getLeftChild()));
			}
			return rightRotation(node);
		}
		// right-right situation
		if (balance < -1) {
			if (getBalance(node.getRightChild()) > 0) {
				node.setRightChild(rightRotation(node.getRightChild()));
			}
			return leftRotation(node);
		}
		return node;
	}

	private Node<T> getPredecessor(Node<T> node) {
		Node<T> predecessor = node;
		while (predecessor.getRightChild() != null) {
			predecessor = predecessor.getRightChild();
		}
		return predecessor;
	}

}
