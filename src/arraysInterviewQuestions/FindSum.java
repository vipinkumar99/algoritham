package arraysInterviewQuestions;

public class FindSum {

	public static void main(String[] args) {
		int[] num = { 12, 34, 56, 78, 3, 4 };
		System.out.println("Sum:" + sum(num));
		System.out.println("Sum Recursion:" + sum(num, num.length));
	}

	public static int sum(int[] num) {
		int sum = num[0];
		for (int i = 1; i < num.length; i++) {
			sum = sum + num[i];
		}
		return sum;
	}

	public static int sum(int[] num, int len) {
		if (len <= 0) {
			return 0;
		}
		return sum(num, len - 1) + num[len - 1];
	}
}
