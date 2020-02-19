package arraysInterviewQuestions;

import java.util.HashSet;
import java.util.Set;

/*Write a java program to find the intersection of two arrays*/
public class Intersection {

	public static void main(String[] args) {
		int[] input1 = { 1, 2, 3, 4, 5, 4 };
		int[] input2 = { 3, 4, 5, 6, 7, 4 };
		intersection(input1, input2);
	}

	public static void intersection(int[] num1, int[] num2) {
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < num1.length; i++) {
			for (int j = 0; j < num2.length; j++) {
				if (num1[i] == num2[j]) {
					set.add(num1[i]);
				}
			}
		}
		System.out.println(set);
	}

}
