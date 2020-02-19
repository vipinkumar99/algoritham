package sorting;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int num[] = { 20, 35, -15, 7, 55, 1, -22, 35 };
		System.out.println(Arrays.toString(num));
		selectionSort(num);
		System.out.println(Arrays.toString(num));
	}

	public static void selectionSort(int[] num) {
		for (int lastUnsortedIndex = num.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
			int large = 0;
			for (int i = 1; i <= lastUnsortedIndex; i++) {
				if (num[i] > num[large]) {
					large = i;
				}
			}
			SwapUtil.swap(num, large, lastUnsortedIndex);
		}
	}
}
