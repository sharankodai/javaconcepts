package java_demo;

import java.util.Scanner;

public class String_demo {
	public static void main(String [] args) {
		Scanner ref = new Scanner(System.in);
		System.out.println("enter the value");
		String next= ref.nextLine();
		String[] split=next.split("");
		for(String string:split)
		{
			System.out.println(string);
		}
		
		String reverse="";
		for(int i=split.length-1;i>=0;i--)
		{
			reverse=reverse+split[i]+"";
		}
		System.out.println(reverse);
		
		if(next.equals(reverse)) {
			System.out.println("It is a palendrome");
			
		}
		else {
			System.out.println("not a palendrome");
		}
	}

}
