package arraysInterviewQuestions;

import java.util.Arrays;

/*Write a java program to find all pairs of elements in an integer array whose sum is equal to a given number*/
public class FindPair {

	public static void main(String[] args) {
		findPair(new int[] { 4, 6, 5, -10, 8, 5, 20 }, 10);
		findPair(new int[] { 4, -5, 9, 11, 25, 13, 12, 8 }, 20);
		findPair(new int[] { 12, 13, 40, 15, 8, 10, -15 }, 25);
		findPair(new int[] { 12, 23, 125, 41, -75, 38, 27, 11 }, 50);
	}

	public static void findPair(int[] num, int sum) {
		System.out.println(Arrays.toString(num));
		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] + num[j] == sum) {
					System.out.println(num[i] + "+" + num[j] + "=" + sum);
				}
			}
		}
	}

}
