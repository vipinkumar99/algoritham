package linkedList;

public class Enode {
	private Emp data;
	private Enode next;

	public Enode(Emp head) {
		super();
		this.data = head;
	}

	public Enode getNext() {
		return next;
	}

	public void setNext(Enode next) {
		this.next = next;
	}

	public Emp getData() {
		return data;
	}

	public void setData(Emp data) {
		this.data = data;
	}

}
