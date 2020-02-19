package arraysInterviewQuestions;

import java.util.HashMap;
import java.util.Map;

/*Write a java program to count occurrences of each element in an array*/
public class CountDuplicate {

	public static void main(String[] args) {
		int[] num = { 12, 34, 12, 5, 6, 3, 7, 6, 5 };
		countDuplicate1(num);
		countDuplicate2(num);
	}

	public static void countDuplicate1(int[] num) {
		Map<Integer, Integer> count = new HashMap<>();
		for (int i = 0; i < num.length; i++) {
			Integer c = count.getOrDefault(num[i], 0);
			c++;
			count.put(num[i], c);
		}
		System.out.println(count);
	}

	public static void countDuplicate2(int[] num) {
		for (int i = 0; i < num.length; i++) {
			int count = 1;
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] == num[j]) {
					count++;
				}
			}
			System.out.println(i + "=" + count);
			count = 0;
		}
	}

}
