package arraysInterviewQuestions;

import java.util.Arrays;

/*
 * Write a java program to find continuous sub array whose sum is equal to a
 * given number
 */
public class FindSumOfContinuousSubarray {

	public static void main(String[] args) {
		findSubarray(new int[] { 42, 15, 12, 8, 6, 32 }, 26);
	}

	public static void findSubarray(int[] num, int sum) {
		System.out.println("Arrays : " + Arrays.toString(num) + " sum : " + sum);
		int temp = num[0];
		int start = 0;
		for (int i = 1; i < num.length; i++) {
			temp = temp - num[i];
			start++;
			if (temp == sum) {
				for (int j = start; j <= i; j++) {
					System.out.print(num[j] + " ");
				}
				System.out.println();
			}
		}
	}
}
