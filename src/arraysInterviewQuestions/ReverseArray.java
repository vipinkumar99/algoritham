package arraysInterviewQuestions;

import java.util.Arrays;

/*Write a java program to reverse an array without using an additional array*/
public class ReverseArray {

	public static void main(String[] args) {
		int[] num={4, 5, 8, 9, 10};
		System.out.println(Arrays.toString(num));
		System.out.println(Arrays.toString(reverse(num)));
	
	}

	public static int[] reverse(int[] num) {
		for (int i = 0; i < num.length / 2; i++) {
			int temp = num[i];
			num[i] = num[num.length - 1 - i];
			num[num.length - 1 - i] = temp;
		}
		return num;
	}
}
