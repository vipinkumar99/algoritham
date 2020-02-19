package stack;

public class ArrayStack<T> implements Stack<T> {

	private T[] stack;
	private int size;

	@SuppressWarnings("unchecked")
	ArrayStack() {
		this.stack = (T[]) new Object[1];
	}

	// O(1) if no resize
	@Override
	public void push(T data) {
		if (size == this.stack.length) {
			resize(2 * this.stack.length);
		}
		this.stack[size++] = data;
	}

	// O(N)
	@SuppressWarnings("unchecked")
	private void resize(int capacity) {
		T[] stackCopy = (T[]) new Object[capacity];
		for (int i = 0; i < size; i++) {
			stackCopy[i] = this.stack[i];
		}
		this.stack = stackCopy;
	}

	// O(1) if no resize
	@Override
	public T pop() {
		T data = this.stack[--size];
		if (size > 0 && size == this.stack.length / 4) {
			resize(this.stack.length / 2);
		}
		return data;
	}

	@Override
	public T peek() {
		return this.stack[size - 1];
	}

	@Override
	public int size() {
		return this.size;
	}

	@Override
	public boolean isEmpty() {
		return this.size == 0;
	}

}
