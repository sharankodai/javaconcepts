package myself;

import java.util.HashMap;
import java.util.Map;

public class no_of_vowels {
	public static void main(String[] args) {
		String s="elephant";
		String[] split = s.split("");
		Map<String,Integer> m=new HashMap<>();
			
		for(int i=0;i<split.length;i++) {
			if(split[i].contains("a")||split[i].contains("e")||split[i].contains("i")||split[i].contains("o")||split[i].contains("u")){
			if(m.containsKey(split[i])) {
				m.put(split[i],m.get(split[i])+1);
								
			}
			else
			{
				m.put(split[i],1);
			}
		}
		}
		System.out.println(m);
	}

}
