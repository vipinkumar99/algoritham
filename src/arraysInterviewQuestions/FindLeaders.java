package arraysInterviewQuestions;

import java.util.Arrays;

/*Write a java program to find all the leaders in an integer array*/
public class FindLeaders {

	public static void main(String[] args) {
		int[] num = { 12, 9, 7, 14, 8, 6, 3 };
		System.out.println(Arrays.toString(num));
		findLeaders(num);
	}

	public static void findLeaders(int[] num) {
		int max = num[num.length - 1];
		System.out.print(max + " ");
		for (int i = num.length - 2; i >= 0; i--) {
			if (num[i] > max) {
				System.out.print(num[i] + " ");
				max = num[i];
			}
		}
	}
}
