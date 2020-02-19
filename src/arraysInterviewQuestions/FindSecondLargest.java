package arraysInterviewQuestions;

import java.util.Arrays;

/*Write a java program to find second largest element in an array of integers*/
public class FindSecondLargest {

	public static void main(String[] args) {
		int[] num = { 12, 45, 13, 78, 23, 67, 89, 100, 321, 450, 200 };
		System.out.println("Arrays : " + Arrays.toString(num));
		System.out.println("Second Largest : " + secondLargest(num));
	}

	public static int secondLargest(int[] num) {
		int firstNo = 0, secondNo = 0;
		for (int i = 0; i < num.length; i++) {
			if (num[i] > firstNo) {
				secondNo = firstNo;
				firstNo = num[i];
			} else if (num[i] > secondNo) {
				secondNo = num[i];
			}
		}
		return secondNo;
	}

}
