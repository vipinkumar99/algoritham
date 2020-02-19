package searching;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		int num[] = { -12, 2, 6, 8, 9, 34, 34 };
		System.out.println(Arrays.toString(num));
		System.out.println("34 : " + binarySearch(num, 34));
		System.out.println("2 : " + binarySearch(num, 2));
		System.out.println("8 : " + binarySearch(num, 8));
		System.out.println("8 : " + binarySearch(num, 80));
		// System.out.println("----------------");
		// System.out.println("34 : " + binarySearchRecursion(num, 34));
		// System.out.println("2 : " + binarySearchRecursion(num, 2));
		// System.out.println("8 : " + binarySearchRecursion(num, 8));
		// System.out.println("8 : " + binarySearchRecursion(num, 80));
		// System.out.println("-------------------------");
		// System.out.println("34 : " + iterationSeacrh(num, 34));
		// System.out.println("2 : " + iterationSeacrh(num, 2));
		// System.out.println("8 : " + iterationSeacrh(num, 8));
		// System.out.println("8 : " + iterationSeacrh(num, 80));

		System.out.println("-------------------------");
		System.out.println("34 : " + recursionSearch2(num, 0, num.length - 1, 34));
		System.out.println("2 : " + recursionSearch2(num, 0, num.length - 1, 2));
		System.out.println("8 : " + recursionSearch2(num, 0, num.length - 1, 8));
		System.out.println("80 : " + recursionSearch2(num, 0, num.length - 1, 80));

	}

	public static int binarySearch(int[] num, int no) {
		int found = -1;
		int start = 0;
		int end = num.length;
		while (start < end) {
			int mid = (start + end) / 2;
			if (num[mid] == no) {
				found = mid;
				break;
			} else if (num[mid] < no) {
				start = mid + 1;
			} else {
				end = mid;
			}
		}
		return found;
	}

	public static int binarySearchRecursion(int[] num, int no) {
		return recursionSearch(num, 0, num.length, no);
	}

	public static int recursionSearch(int[] num, int start, int end, int no) {
		if (start >= end) {
			return -1;
		}
		int mid = (start + end) / 2;
		if (num[mid] == no) {
			return mid;
		} else if (num[mid] < no) {
			return recursionSearch(num, mid + 1, end, no);
		} else {
			return recursionSearch(num, start, mid, no);
		}
	}

	public static int iterationSeacrh(int[] num, int search) {
		int start = 0;
		int end = num.length - 1;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (num[mid] == search) {
				return mid;
			} else if (search > num[mid]) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		return -1;
	}

	public static int recursionSearch2(int[] num, int start, int end, int search) {
		if (start > end) {
			return 0;
		}
		int mid = (start + end) / 2;
		if (num[mid] == search) {
			return mid;
		} else if (search > num[mid]) {
			recursionSearch(num, mid + 1, end, search);
		} else {
			recursionSearch(num, start, mid - 1, search);
		}
		return -1;
	}

}
