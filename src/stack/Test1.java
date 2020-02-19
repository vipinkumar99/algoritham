package stack;

public class Test1 {

	public static void main(String[] args) {
		Stack<Integer> stack = new LinkedListStack<Integer>();
		System.out.println("isEmpty : " + stack.isEmpty());
		stack.push(12);
		stack.push(45);
		stack.push(67);
		System.out.println("isEmpty : " + stack.isEmpty());
		System.out.println(stack.peek());
		System.out.println("size : " + stack.size());
		System.out.println(stack.pop());
		System.out.println("size : " + stack.size());
	}

}
