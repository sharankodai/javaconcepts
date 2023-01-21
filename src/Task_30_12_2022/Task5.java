package Task_30_12_2022;

public class Task5 {
	public static void main(String[] args) {
		String s="HoMePaGe";
		System.out.println(s);
	    char[] charArr = s.toCharArray();
//	    System.out.println(split);
	    for (int i=0;i<=charArr.length-1;i++) {
	    	if(Character.isLowerCase(charArr[i])) {
	    		System.out.print(Character.toUpperCase(charArr[i]));
	    	
	    	}
	    }
	}
}
	    	
	    	
			
		
		
	
