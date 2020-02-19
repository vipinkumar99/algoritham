package sorting;

public class SwapUtil {
	public static void swap(int num[], int i, int j) {
		if (i != j) {
			int temp = num[i];
			num[i] = num[j];
			num[j] = temp;
		}
	}

}
