package Basicprograms;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class RPTW {

	public static void main(String[] args) {

		String words="Accessing one class property one class";
		
		String[] split = words.split(" ");
		
		Map<String,Integer> map= new LinkedHashMap<>();
		
		for(String word:split) {
			if(map.containsKey(word)) {
				Integer integer = map.get(word);
				map.put(word, integer+1);
			}
			else {
				map.put(word, 1);
			}
			
		}
		System.out.println(map);
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		System.out.println(entrySet);
		for(Entry<String,Integer> entry2:entrySet) {
			if(entry2.getValue()>1)
			{
				System.out.println("Repetative words:"+entry2);
			}
		}
		
		
		

	}

}
