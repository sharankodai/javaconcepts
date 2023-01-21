package java_demo;

import java.util.ArrayList;
import java.util.List;

public class string_function {
	public static void main(String [] args) {
		List<Integer> list = new ArrayList<>();
		List<Integer> list1=new ArrayList<>();
		list1.add(12);
		list1.add(100);		
		list.add(12);
		list.add(13);
		list.add(50);
		list.add(65);
		list.add(12);
		System.out.println(list);
		System.out.println(list1);
		int length = list.size();
		System.out.println(length);
		Integer secondindex = list.get(1);
		System.out.println(secondindex);
		int indexOf = list.indexOf(12);
		System.out.println(indexOf);
		list.remove(1);
		System.out.println(list);
		boolean contains = list.contains(50);
		System.out.println(contains);
		//boolean retainAll = list.retainAll(list1);
		//System.out.println(retainAll);
		System.out.println(list);
		list.addAll(list1);
		System.out.println(list);
		//list.clear();
		//System.out.println(list);
		list.removeAll(list1);
		System.out.println(list);
		
		
		
	}

}
