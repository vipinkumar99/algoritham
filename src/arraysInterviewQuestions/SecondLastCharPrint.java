package arraysInterviewQuestions;

public class SecondLastCharPrint {

	public static void main(String[] args) {
		String str = "Hello I Love Java developer";
		// lvve
		System.out.println("Str : " + getLast(str));
		split(str);
	}

	public static String getLast(String str) {
		StringBuilder sb = new StringBuilder();
		String[] split = str.split(" ");
		for (String s : split) {
			if (s.length() > 1) {
				sb.append(s.charAt(s.length() - 2));
			}
		}
		return sb.toString();
	}

	public static void split(String str) {
		char[] ch = str.toCharArray();
		StringBuilder sb = new StringBuilder();
		boolean isLast = false;
		for (int i = 0; i < ch.length; i++) {
			sb.append(ch[i]);
			if (ch[i] == ' ') {
				System.out.println(sb.toString());
				sb = null;
				sb = new StringBuilder();
				isLast = true;
			}
		}
		if (isLast) {
			System.out.println(sb.toString());
		}
	}

}
