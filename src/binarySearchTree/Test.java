package binarySearchTree;

public class Test {

	public static void main(String[] args) {
		Tree<Integer> tree = new BinarySearchTree<>();
		tree.add(10);
		tree.add(-1);
		tree.add(0);
		tree.add(1000);
		tree.add(-22);
		tree.add(50);

		System.out.println("min  : " + tree.getMin());
		System.out.println("max : " + tree.getMax());
		tree.inorderShowAll();
	}

}
