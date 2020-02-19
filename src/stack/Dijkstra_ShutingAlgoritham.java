package stack;

public class Dijkstra_ShutingAlgoritham {

	private java.util.Stack<String> operatorStack;
	private java.util.Stack<Double> valueStack;

	public Dijkstra_ShutingAlgoritham() {
		this.operatorStack = new java.util.Stack<>();
		this.valueStack = new java.util.Stack<>();
	}

	public void interpretExpression(String expression) {
		String[] expArray = expression.split(" ");
		for (String exp : expArray) {
			if (exp.equals("(")) {

			} else if (exp.equals("+")) {
				this.operatorStack.push(exp);
			} else if (exp.equals("*")) {
				this.operatorStack.push(exp);
			} else if (exp.equals(")")) {
				String op = this.operatorStack.pop();
				if (op.equals("+")) {
					this.valueStack.push(this.valueStack.pop() + this.valueStack.pop());
				} else if (op.equals("*")) {
					this.valueStack.push(this.valueStack.pop() * this.valueStack.pop());
				}
			} else {
				this.valueStack.push(Double.valueOf(exp));
			}
		}
	}

	public void result() {
		System.out.println(this.valueStack.pop());
	}

	public static void main(String[] args) {
		Dijkstra_ShutingAlgoritham algo = new Dijkstra_ShutingAlgoritham();
		algo.interpretExpression("( ( 1 + 2 ) * ( 2 + 1 ) )");
		algo.result();
	}

}
