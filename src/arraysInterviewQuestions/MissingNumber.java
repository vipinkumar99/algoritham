package arraysInterviewQuestions;

/* write a program to find out missing number in array */
public class MissingNumber {

	public static void main(String[] args) {
		int[] num = { 2, 1, 4, 3, 6, 7, 9, 8 };
		System.out.println("Missing Number : " + missingNo(num));
		System.out.println("Missing Number : " + missing(num));
	}

	public static int missingNo(int[] num) {
		int n = num.length + 1;
		int sum = (n * (n + 1)) / 2;
		for (int i = 0; i < num.length; i++) {
			sum = sum - num[i];
		}
		return sum;
	}

	public static int missing(int[] num) {
		int n = num.length + 1;
		int sum = (n * (n + 1)) / 2;
		int total = 0;
		for (int i = 0; i < num.length; i++) {
			total = total + num[i];
		}
		return sum - total;
	}
}
