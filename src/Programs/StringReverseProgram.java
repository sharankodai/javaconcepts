package Programs;

import java.util.Iterator;

public class StringReverseProgram {

	public static String s = "my name is java";
	public static char c;

	public static void Task1() {
		String[] s1 = s.split(" ");
		for (int i = s1.length - 1; i >= 0; i--) {
			System.out.print(s1[i] + " ");
		}
	}

	public static void Task2() {
		String[] s1 = s.split(" ");
		
		for (int i = s1.length - 1; i >= 0; i--) {
//			System.out.println(s1);
			System.out.print(s1[i]);
			if (i==0) {
				//break;
			}
			else {
				System.out.print("*");
			}
		}

	}

	public static void Task3() {
		String[] s1 = s.split(" ");
		for (int i = s1.length - 1; i >= 0; i--) {
			char[] ch = s1[i].toCharArray();
			for (int j = 0; j < ch.length; j++) {
				if (j == 0) {
					c = Character.toUpperCase(ch[j]);
				} else {
					c = Character.toLowerCase(ch[j]);
				}
				System.out.print(c);
			}
			System.out.print(" ");
		}

	}

	public static void Task4() {
		String[] s1 = s.split(" ");
		for (int i = 0; i < s1.length; i++) {
			char[] ch = s1[i].toCharArray();
			for (int j = 0; j < ch.length; j++) {
				if (j == 0) {
					c = Character.toUpperCase(ch[j]);
				} else {
					c = Character.toLowerCase(ch[j]);
				}
				System.out.print(c);
			}
			System.out.print(" ");
		}
	}

	public static void Task5() {
		String[] s1 = s.split(" ");
		for (int i = 0; i < s1.length; i++) {
			char[] ch = s1[i].toCharArray();
			for (int j = 0; j < ch.length; j++) {
				if (j == ch.length - 1) {
					c = Character.toUpperCase(ch[j]);
				} else {
					c = Character.toLowerCase(ch[j]);
				}
				System.out.print(c);
			}
			System.out.print(" ");
		}
	}

	public static void Task6() {
		String[] s1 = s.split(" ");
		for (int i = s1.length - 1; i >= 0; i--) {
			char[] ch = s1[i].toCharArray();
			for (int j = 0; j < ch.length; j++) {
				if (j == ch.length - 1) {
					c = Character.toUpperCase(ch[j]);
				} else {
					c = Character.toLowerCase(ch[j]);
				}
				System.out.print(c);
			}
			System.out.print(" ");
		}
	}

	public static void main(String[] args) {
		Task1();
		System.out.println();
		Task2();
		System.out.println();
		Task3();
		System.out.println();
		Task4();
		System.out.println();
		Task5();
		System.out.println();
		Task6();

	}

}
