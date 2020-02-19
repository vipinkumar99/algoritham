package binaryTree;

public class Test {

	public static void main(String[] args) {
		Tree tree = new BinaryTree();
		tree.add(2);
		tree.add(7);
		tree.add(5);
		tree.add(2);
		tree.add(6);
		tree.add(5);
		tree.add(11);
		tree.add(9);
		tree.add(4);
		tree.inorder();
		System.out.println("sum : " + tree.sum());
		System.out.println("diff : " + tree.evenOddDifference());
		System.out.println("Total : " + tree.totalNode());
		System.out.println("Total : " + tree.totalLeaf());
	}

}
