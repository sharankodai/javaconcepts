package Programs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Vector;

public  class List_Set_Map {
	
	public static void list() {

		List<String> s = new ArrayList<>();
		s.add("sharan");
		s.add("revathi");
		s.add("anbu");
		
		System.out.println(s.size());
		System.out.println(s);
		
		List<String> s1 = new LinkedList<>();
		s1.add("praveen");
		s1.add("bala");
		s1.add("imbi");
		System.out.println(s1);
		
		
		List<String> s2 = new Vector<>();
		s2.add("vijay");
		s2.add("Ammu");
		s2.add("Seenu");
		System.out.println(s2);
		s2.remove("Ammu");
		System.out.println(s2);
		s1.remove(0);
		
		System.out.println(s1);
		
		s1.add(0, "bond");
		System.out.println(s1);
		s1.add("bond");
		System.out.println(s1);
		
		System.out.println("=============================================================");
		
		Set<String> t = new HashSet<>();
		t.add("tommy");
		t.add("pug");
		t.add("imam");
		t.add("tommy");
		System.out.println(t);
		
		
		Set<String> t1 = new LinkedHashSet<>();
		t1.add("ball");
		t1.add("bat");
		t1.add("ball");
		t1.add("ground");
		System.out.println(t);
		
		System.out.println(s.get(2));
	}
	public static void main(String[] args) {
		list();
	}
}
