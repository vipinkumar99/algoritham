package stack;

public class Test2 {

	public static void main(String[] args) {
		Stack<Integer> stack = new ArrayStack<>();
		System.out.println("isEmpty : " + stack.isEmpty());
		stack.push(12);
		stack.push(34);
		stack.push(45);
		System.out.println("isEmpty : " + stack.isEmpty());
		System.out.println("size : " + stack.size());
		System.out.println(stack.peek());
		System.out.println("size : " + stack.size());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		System.out.println(stack.pop());

	}

}
