package linkedList;

public class Test1 {

	public static void main(String[] args) {
		LinkedList l = new DoublyList();
		l.addFirst(new Emp(1));
		l.addFirst(new Emp(2));
		l.addFirst(new Emp(3));
		l.addFirst(new Emp(4));
		System.out.println("size:" + l.size());
		l.show();
		//System.out.println(l.deleteLast());
	//	System.out.println("size:" + l.size());
	//	l.show();
	}

}
