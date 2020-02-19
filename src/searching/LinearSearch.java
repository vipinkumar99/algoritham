package searching;

import java.util.Arrays;

public class LinearSearch {

	public static void main(String[] args) {

		int num[] = { 20, 35, -15, 7, 55, 1, -22, 35 };
		System.out.println(Arrays.toString(num));
		System.out.println("35 : " + linearSearch(num, 35));
		System.out.println("35 : " + linearSearch(num, -22));
	}

	public static int linearSearch(int[] num, int no) {
		int found = -1;
		for (int i = 0; i < num.length; i++) {
			if (num[i] == no) {
				found = i;
				break;
			}
		}
		return found;
	}
}
