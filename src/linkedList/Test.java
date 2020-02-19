package linkedList;

public class Test {

	public static void main(String[] args) {
		LinkedList l = new SinglyList();
		l.addFirst(new Emp(1));
		l.addFirst(new Emp(2));
		l.addFirst(new Emp(3));
		l.addFirst(new Emp(4));
		System.out.println("size:" + l.size());
		l.show();
		System.out.println(l.deleteLast());
		System.out.println("size:" + l.size());
		l.show();

		// LinkedList l = new SinglyList();
		// System.out.println("size:" + l.size());
		// System.out.println("isEmpty : " + l.isEmpty());
		// l.addLast(new Emp(1));
		// l.addLast(new Emp(5));
		// System.out.println("size:" + l.size());
		// System.out.println("isEmpty : " + l.isEmpty());
		// l.show();
	}

}
