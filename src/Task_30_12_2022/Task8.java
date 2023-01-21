package Task_30_12_2022;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task8 {
	
	public static int x;
public static void main(String[] args) {
	int a[]= {23,7,9,56,90};

	Arrays.sort(a);
	
	for (int i : a) {
		System.out.print(i+" ");
		
	 x = Array.getInt(a, 2);
	
	}
	System.out.println();
	System.out.println("Third Largest value==============:"+x);
}

}

