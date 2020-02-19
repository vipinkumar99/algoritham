package sorting;

import java.util.Arrays;

public class ShellSort {

	public static void main(String[] args) {
		int num[] = { 20, 35, -15, 7, 55, 1, -22, 35 };
		System.out.println(Arrays.toString(num));
		shellSort(num);
		System.out.println(Arrays.toString(num));
	}

	public static void shellSort(int[] num) {
		for (int gap = num.length / 2; gap > 0; gap /= 2) {
			for (int i = gap; i < num.length; i++) {
				int no = num[i];
				int j = i;
				while (j >= gap && num[j - gap] > no) {
					num[j] = num[j - gap];
					j -= gap;
				}
				num[j] = no;
			}
		}
	}

}
