package sorting;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int num[] = { 20, 35, -15, 7, 55, 1, -22, 35 };
		System.out.println(Arrays.toString(num));
		insertionSort(num);
		System.out.println(Arrays.toString(num));
	}

	public static void insertionSort(int[] num) {
		for (int firstUnsortedIndex = 1; firstUnsortedIndex < num.length; firstUnsortedIndex++) {
			int no = num[firstUnsortedIndex];
			int i;
			for (i = firstUnsortedIndex; i > 0 && num[i - 1] > no; i--) {
				num[i] = num[i - 1];
			}
			num[i] = no;
		}
	}

}
