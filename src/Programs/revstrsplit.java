package Programs;

public class revstrsplit {
	public static void main(String[] args) {
		String s = "java james gosling";
		String[] split = s.split(" ");

		for (String s1 : split) {
			for (int i = s1.length() - 1; i >= 0; i--) {
				System.out.print(s1.charAt(i));
			}
			System.out.print(" ");

		}
	}
}
