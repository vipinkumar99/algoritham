package arraysInterviewQuestions;

import java.util.Arrays;

/*Write a java program to separate zeros from non-zeros in an integer array*/
public class AddZeroAtEnd {

	public static void main(String[] args) {
		int[] num = { 12, 0, 7, 0, 8, 0, 0, 3 };
		System.out.println(Arrays.toString(num));
		System.out.println(Arrays.toString(addZeroAtEnd(num)));
	}

	public static int[] addZeroAtEnd(int[] num) {
		int count = 0;
		for (int i = 0; i < num.length; i++) {
			if (num[i] != 0) {
				num[count] = num[i];
				count++;
			}
		}
		while (count < num.length) {
			num[count] = 0;
			count++;
		}
		return num;
	}
}
