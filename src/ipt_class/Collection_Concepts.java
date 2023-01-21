package ipt_class;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Collection_Concepts {
	private void list_Concept() {

		List<Object> l = new ArrayList<Object>();
		l.add(10);
		l.add(12);
		l.add(25);
		l.add(54);

		System.out.println("Print single value");

		Object object1 = l.get(3);
		System.out.println(object1);

		System.out.println("Print Multiple value");

		for (Object m : l) {

			System.out.println(m);

		}

	}

	private void set_Concepts() {

		Set<Integer> o = new HashSet<Integer>();
//		o.add("6667");
		o.add(5678);
//		o.add("Time");

		System.out.println("Single Value in Set");
//
		Integer oo[] = o.toArray(new Integer[o.size()]);

		System.out.println(oo[0]);

		System.out.println("Multiple Value in Set");

		for (Object ss : o) {
			System.out.println(ss);
		}

	}

	private void map_Concepts() {
		
		Map<String,Integer> mm	= new HashMap<String,Integer>();
		
		mm.put("sharan", 1198);
		mm.put("anbu", 1120);
		mm.put("george",1127);
		
		System.out.println(mm);
		
		Integer integer = mm.get("anbu");
		System.out.println("Single value in map" +" "+integer);
		
		System.out.println("Multiple Value in set");
		Set<Entry<String, Integer>> entrySet = mm.entrySet();
		for(Entry <String,Integer> entry:entrySet) {
			System.out.println(entry);
		}

	}

	public static void main(String[] args) {

		Collection_Concepts s = new Collection_Concepts();
		s.list_Concept();
		s.set_Concepts();
		s.map_Concepts();

	}

}

