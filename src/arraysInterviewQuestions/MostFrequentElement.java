package arraysInterviewQuestions;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/*Write a java program to find the most frequent element in an array*/
public class MostFrequentElement {

	public static void main(String[] args) {
		int[] num = { 4, 5, 8, 7, 4, 7, 6, 7 };
		System.out.println(mostFrequentElement(num));
	}

	public static int mostFrequentElement(int[] num) {
		Map<Integer, Integer> count = new HashMap<>();
		for (int i = 0; i < num.length; i++) {
			Integer c = count.getOrDefault(num[i], 0);
			c++;
			count.put(num[i], c);
		}
		int key = 0;
		int value = 1;
		for (Entry<Integer, Integer> map : count.entrySet())
			if (map.getValue() > value) {
				value = map.getValue();
				key = map.getKey();
			}
		System.out.println(key + " = " + value);
		return key;
	}

}
