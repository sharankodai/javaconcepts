package Task_30_12_2022;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class Task6 {
	public static void main(String[] args) {
		int a[]= {1,0,2,0,3};
//		int temp =0;
//		for (int i=0;i<=a.length-1;i++)
//		{
//			System.out.print(a[i]+" ");
//						
//		}
//		
//		for (int i=0;i<=a.length-1;i++)
//		{
//			for(int j=i+1;j<=a.length-1;j++) {
//				if(a[i]>a[j]) {
//					temp=a[i];
//					a[i]=a[j];
//					a[j]=temp;
//							}
//			}
//			}
//		System.out.println();
//		
//	
		Arrays.sort(a);
		for (int i=0;i<=a.length-1;i++)
			{
				System.out.print(a[i]+",");
//							
			}
//		for (int i : a) {
//			System.out.print(a[i]);
			
		}

		
	}

