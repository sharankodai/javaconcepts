package Task_30_12_2022;

public class Task4 {
	
	public static void main(String[] args) {
		String s="thermofisher scientific";
		String[] split = s.split(" ");
		
		for(int i=0;i<=split.length-1;i++) {
//		System.out.println(split[i]);
		if(i==0) {
			
				char[] charArray = split[i].toCharArray();
//				System.out.println(charArray);
				for(int j=charArray.length-1;j>=0;j--) {
					System.out.print(charArray[j]);
				}
				
		}
		else {
			System.out.print(" "+split[i]);
		}
		
		
		}
	}
}
				
				
				
	
