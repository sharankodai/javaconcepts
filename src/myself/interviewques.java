package myself;

//o/p: "&^%javaprogramis123"
public class interviewques {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		String str = "java program 12389hc &^% is";
		String Characters = "";
		String digits = "";
		String special = "";
		for (int i = 0; i < str.length(); i++) {
			char charAt = str.charAt(i);
			if (Character.isLetter(charAt)) {
				Characters = Characters + charAt;
			}
			if (Character.isDigit(charAt)) {
				digits = digits + charAt;
			}
			if (!Character.isLetter(charAt) && !Character.isDigit(charAt) && !Character.isSpace(charAt)) {
				special = special + charAt;
			}
		}

//		System.out.println(Characters);
//		System.out.println(digits);
//		System.out.println(special);
		System.out.println(special + Characters + digits);

	}
}
