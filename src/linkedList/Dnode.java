package linkedList;

public class Dnode {
	private Emp data;
	private Dnode next;
	private Dnode previous;

	public Dnode(Emp data) {
		super();
		this.data = data;
	}

	public Emp getData() {
		return data;
	}

	public void setData(Emp data) {
		this.data = data;
	}

	public Dnode getNext() {
		return next;
	}

	public void setNext(Dnode next) {
		this.next = next;
	}

	public Dnode getPrevious() {
		return previous;
	}

	public void setPrevious(Dnode previous) {
		this.previous = previous;
	}

}
