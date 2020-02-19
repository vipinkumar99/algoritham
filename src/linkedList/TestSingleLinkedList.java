package linkedList;

public class TestSingleLinkedList {

	public static void main(String[] args) {
		List<Integer> list = new SingleLinkedList<>();
		list.add(12);
		list.add(34);
		list.add(56);
		list.add(67);
		list.showAll();
		list.delete(12);
		list.showAll();

	}

}
