package Task_30_12_2022;

public class Task9 {

	public static void swappingTwoString() {

		String s = "Good";
		String s1 = "Morning ";
		String temp;
		
		System.out.println("Strings before swapping: " + s + " " + s1);
		
		temp=s;
		s=s1;
		s1=temp;
//		s = s + s1;
//		s1 = s.substring(0, (s.length() - s1.length()));
//		s = s.substring(s1.length());
		System.out.println("Strings after swapping: " + s + " " + s1);
	}

	public static void main(String[] args) {
		swappingTwoString();

	}
}
