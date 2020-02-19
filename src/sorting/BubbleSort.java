package sorting;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int num[] = { 20, 35, -15, 7, 55, 1, -22, 35 };
		System.out.println(Arrays.toString(num));
		bubbleSort(num);
		System.out.println(Arrays.toString(num));
	}

	public static void bubbleSort(int[] num) {
		for (int lastUnsortedIndex = num.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
			boolean swap = false;
			for (int i = 0; i < lastUnsortedIndex; i++) {
				if (num[i] > num[i + 1]) {
					SwapUtil.swap(num, i, i + 1);
					swap = true;
				}
			}
			if (!swap) {
				break;
			}
		}
	}
}
