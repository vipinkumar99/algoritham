package arraysInterviewQuestions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*Write a java program to find duplicate elements in an array*/
public class Duplicate {

	public static void main(String[] args) {
		String[] str = { "java", "jsp", "html", "spring", "java" };
		System.out.println(Arrays.toString(str));
		printDuplicate1(str);
		printDuplicate2(str);
	}

	public static void printDuplicate1(String[] str) {
		for (int i = 0; i < str.length; i++) {
			for (int j = i + 1; j < str.length; j++) {
				if (str[i].equals(str[j])) {
					System.out.println("Duplicate String is : " + str[i]);
					break;
				}
			}
		}
	}

	public static void printDuplicate2(String[] str) {
		Set<String> set = new HashSet<>();
		for (String s : str) {
			if (!set.add(s)) {
				System.out.println("Duplicate String is : " + s);
				break;
			}
		}
	}

}
