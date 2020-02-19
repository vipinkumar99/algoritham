package arraysInterviewQuestions;

import java.util.Arrays;

/*Write a java program to separate zeros from non-zeros in an integer array*/
public class AddZeroAtStart {

	public static void main(String[] args) {
		int[] num = { 12, 0, 7, 0, 8, 0, 0, 3 };
		System.out.println(Arrays.toString(num));
		System.out.println(Arrays.toString(addZeroAtStart(num)));
	}

	public static int[] addZeroAtStart(int[] num) {
		int count = num.length - 1;
		for (int i = num.length - 1; i >= 0; i--) {
			if (num[i] != 0) {
				num[count] = num[i];
				count--;
			}
		}
		while (count >= 0) {
			num[count] = 0;
			count--;
		}
		return num;
	}
}
