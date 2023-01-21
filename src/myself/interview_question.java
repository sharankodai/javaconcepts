package myself;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

//i/p:" java program 12389hc &^% is"
//o/p: "&^%javaprogramis123"
//o/p: Least length in the given string: is

public class interview_question {
	public static void main(String[] args) {
		
	String str="java program 12389hc &^% is";
//	String replaceAll = s.replaceAll("[&^%]", "");
//	System.out.print("replace : "+replaceAll);
	
	StringBuilder characters= new StringBuilder();
	StringBuilder digits= new StringBuilder();
	StringBuilder special= new StringBuilder();
	
	
	
	for(int i=0;i<str.length();i++) {
		char charAt = str.charAt(i);
		if(Character.isAlphabetic(charAt)) {
			characters.append(charAt);
					
		}
		if(Character.isDigit(charAt))
		{
		digits.append(charAt);
		}
		if ((charAt >= 33 && charAt <= 47) ||
                (charAt >= 58 && charAt <= 64) ||
                (charAt >= 91 && charAt <= 96) ||
                (charAt >= 123 && charAt <= 126)) {
			special.append(charAt);
		}
	}
	System.out.print(special+" "+characters+" "+digits);
//	System.out.print(characters);
//	System.out.print(digits);
	
	
	
	
//	String[] split = s.split("");
//	for(int i=0;i<split.length;i++) {
//		if(split[i].contains("&") || split[i].contains("^") || split[i].contains("%") ) {
//			System.out.print(split[i]);
//	}}
//		for(int j=0;j<split.length;j++) {
//		
//		if(split[j].contains("j") |	|split[j].contains("a")||split[j].contains("v")
//				||split[j].contains("a")||split[j].contains("p")||split[j].contains("r")
//				||split[j].contains("o") ||split[j].contains("g") ||split[j].contains("r")
//				||split[j].contains("a") ||split[j].contains("m") ||split[j].contains("h")
//				||split[j].contains("c")||split[j].contains("i")||split[j].contains("s"))
//		{
//			System.out.print(split[j]);
//							}}
//		for(int k=0;k<split.length;k++) {
//			if (split[k].contains("1") ||split[k].contains("2") ||split[k].contains("3")) {
//				System.out.print(split[k]);
//		}
//      
//}
		System.out.println();
		String[] split2 = str.split(" ");
		
	
		
//		Object object = l.get(4);
//		System.out.println(object);
		Optional<String> min = Arrays.stream(split2).min(Comparator.comparingInt(String::length));
		Optional<String> max = Arrays.stream(split2).max(Comparator.comparingInt(String::length));
		System.out.println("min : "+min);
		System.out.println("Max : "+max);
                
}}