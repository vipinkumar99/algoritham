package arraysInterviewQuestions;

/*Write a java program to check the equality of two arrays*/
public class CheckEqual {

	//https://javaconceptoftheday.com/java-array-interview-programs/
	public static void main(String[] args) {
		int[] arrayOne = { 21, 57, 11, 37, 24 };
		int[] arrayTwo = { 21, 57, 11, 37, 24 };
		System.out.println("Equal : " + equal(arrayOne, arrayTwo));
	}

	public static boolean equal(int[] first, int[] second) {
		if (first.length != second.length) {
			return false;
		}
		boolean equal = true;
		for (int i = 0; i < first.length; i++) {
			if (first[i] != second[i]) {
				equal = false;
			}
		}
		return equal;
	}
}
