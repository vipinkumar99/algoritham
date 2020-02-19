package binaryTree;

public class BinaryTree implements Tree {

	private Node root;

	@Override
	public void add(int data) {
		if (this.root == null) {
			Node node = new Node(data);
			this.root = node;
		} else {
			add(this.root, data);
		}
	}

	public void add(Node node, int data) {
		if (data < node.getData()) {
			if (node.getLeft() == null) {
				Node left = new Node(data);
				node.setLeft(left);
			} else {
				add(node.getLeft(), data);
			}
		} else if (data > node.getData()) {
			if (node.getRight() == null) {
				Node right = new Node(data);
				node.setRight(right);
			} else {
				add(node.getRight(), data);
			}
		}
	}

	@Override
	public void delete(int data) {
		// TODO Auto-generated method stub

	}

	@Override
	public void inorder() {
		/* Left - Root - Right */
		if (this.root != null) {
			inorder(this.root);
			System.out.println();
		}
	}

	private void inorder(Node node) {
		if (node.getLeft() != null) {
			inorder(node.getLeft());
		}
		System.out.print(node.getData() + " ");
		if (node.getRight() != null) {
			inorder(node.getRight());
		}
	}

	@Override
	public void preorder() {
		/* Root - Left - Right */
		if (this.root != null) {
			preorder(this.root);
			System.out.println();
		}
	}

	private void preorder(Node node) {
		System.out.print(node.getData() + " ");
		if (node.getLeft() != null) {
			preorder(node.getLeft());
		}
		if (node.getRight() != null) {
			preorder(node.getRight());
		}
	}

	@Override
	public void postorder() {
		/* Left - Right -Root */
		if (this.root != null) {
			postorder(this.root);
			System.out.println();
		}
	}

	private void postorder(Node node) {
		if (node.getLeft() != null) {
			postorder(node.getLeft());
		}
		if (node.getRight() != null) {
			postorder(node.getRight());
		}
		System.out.print(node.getData() + " ");
	}

	@Override
	public void levelOrder() {

	}

	private void levelOrder(Node node) {
	}

	@Override
	public boolean equal(Node t1, Node t2) {
		if (t1 == null && t2 == null) {
			return true;
		}
		if (t1 == null || t2 == null) {
			return false;
		}
		return t1.getData() == t2.getData() && equal(t1.getLeft(), t2.getLeft()) && equal(t1.getRight(), t2.getRight());
	}

	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}

	@Override
	public int sum() {
		return sumOfNode(this.root);
	}

	private int sumOfNode(Node node) {
		if (node == null) {
			return 0;
		}
		return node.getData() + sumOfNode(node.getLeft()) + sumOfNode(node.getRight());
	}

	@Override
	public int evenOddDifference() {
		return getEvenSumOddDiff(this.root);
	}

	private int getEvenSumOddDiff(Node node) {
		if (node == null) {
			return 0;
		}
		return node.getData() - getEvenSumOddDiff(node.getLeft()) - getEvenSumOddDiff(node.getRight());
	}

	@Override
	public int totalNode() {
		return totalNodeCount(this.root);
	}

	private int totalNodeCount(Node node) {
		if (node == null) {
			return 0;
		}
		return 1 + totalNodeCount(node.getLeft()) + totalNodeCount(node.getRight());
	}

	@Override
	public int totalLeaf() {
		return totalLeafNode(this.root);
	}

	private int totalLeafNode(Node node) {
		if (node == null) {
			return 0;
		}
		if (node.getLeft() == null && node.getRight() == null) {
			return 1;
		}
		return totalLeafNode(node.getLeft()) + totalLeafNode(node.getRight());
	}
}
