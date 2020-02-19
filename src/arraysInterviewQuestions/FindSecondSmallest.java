package arraysInterviewQuestions;

import java.util.Arrays;

/*Write a java program to find second smallest element in an array of integers*/
public class FindSecondSmallest {

	public static void main(String[] args) {
		int[] num = { 45, 13, 78, 23, 67, 89, 100, 321, 450, 200 };
		System.out.println("Arrays : " + Arrays.toString(num));
		System.out.println("Second Smallest : " + secondSmallest(num));
	}

	public static int secondSmallest(int[] num) {
		int firstNo = num[0], secondNo = num[1];
		for (int i = 2; i < num.length; i++) {
			if (num[i] < firstNo) {
				secondNo = firstNo;
				firstNo = num[i];
			} else if (num[i] < secondNo) {
				secondNo = num[i];
			}
		}
		return secondNo;
	}
}
