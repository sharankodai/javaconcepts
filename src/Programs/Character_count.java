package Programs;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Character_count {
	public static void main(String[] args) {
//		String s="java is a programming language";
//		char[] ch = s.toCharArray();
//		Map<Character,Integer> m= new HashMap<>();
//		for (char c : ch) {
//			if(m.containsKey(c)) {
//				m.put(c, m.get(c)+1);	
//			
//		}
//		else {
//			m.put(c, 1);
//		}
//	}
//		System.out.println(m);
//
//	}
		
		Date date = new Date();
		SimpleDateFormat d = new SimpleDateFormat("mm/dd/yyyy");
		d=new SimpleDateFormat("dd-m-yyyy hh:mm:ss");
//		d= new SimpleDateFormat();
		String format=d.format(date);
		String r=format.replaceAll("/", "-");	
		System.out.println(r);
	}
}
