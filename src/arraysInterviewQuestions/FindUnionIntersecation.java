package arraysInterviewQuestions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*Write a java program to find union and intersection of multiple arrays*/
public class FindUnionIntersecation {

	public static void main(String[] args) {
		Integer[] input1 = { 2, 3, 4, 7, 1 };
		Integer[] input2 = { 4, 1, 3, 5 };
		Integer[] input3 = { 8, 4, 6, 2, 1 };
		Integer[] input4 = { 7, 9, 4, 1 };
		union(input1, input2, input3, input4);
		intersection(input1, input2, input3, input4);
	}

	public static void union(Integer[]... num) {
		Set<Integer> set = new HashSet<>();
		for (Integer[] n : num) {
			for (int i = 0; i < n.length; i++) {
				set.add(n[i]);
			}
		}
		System.out.println(set);
	}

	public static void intersection(Integer[]... num) {
		HashSet<Integer> set = new HashSet<>(Arrays.asList(num[0]));
		for (int i = 1; i < num.length; i++) {
			set.retainAll(Arrays.asList(num[i]));
		}
		System.out.println(set);
	}
}
