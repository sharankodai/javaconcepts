package myself;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class interviewques2 {
	public static void main(String[] args) {

		String str = "java program 12389hc &^% is";
		String[] split = str.split(" ");
		
		List<String> l=new ArrayList<>(); 
		for(int i=0;i<split.length;i++) {
			l.add(split[i]);
		}
System.out.println(l);	
Collections.sort(l);
System.out.println("sorted list"+l);
}
}