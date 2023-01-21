package Programs;

import java.util.HashMap;
import java.util.Map;

public class Words_count {
	public static void main(String[] args) {
		String s="java is a programming language java";
		  String[] split = s.split(" ");
		Map<String,Integer> m= new HashMap<>();
		for (String c : split) {
			if(m.containsKey(c)) {
				m.put(c, m.get(c)+1);	
			
		}
		else {
			m.put(c, 1);
		}
	}
		System.out.println(m);

	}

}
