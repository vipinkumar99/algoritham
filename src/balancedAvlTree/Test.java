package balancedAvlTree;

public class Test {

	public static void main(String[] args) {
		// doubly right heavy situation
		Tree<Integer> t1 = new AvlTree<>();
		t1.add(10);
		t1.add(15);
		t1.add(5);
		t1.add(4);
		
		t1.delete(15);

	}

}
