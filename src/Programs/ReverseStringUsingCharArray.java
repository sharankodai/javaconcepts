package Programs;

public class ReverseStringUsingCharArray {
	public static String a = "Malayalam tamil";

//	public static void reverse() {
//		char[] charArray = a.toCharArray();
////		  System.out.println(charArray);
//
//		for (int i = charArray.length - 1; i >= 0; i--) {
//			System.out.print(charArray[i]);
//
//		}
//	}
	
    public static void usingspilt() {
    	String[] split = a.split("");
    	String reverse="";
    	for (int i = split.length-1; i >=0 ; i--) {
    		reverse=reverse+split[i];
			
		}
    	System.out.println("reverse using split"+" "+reverse);
    	if(a.equals(reverse))
    			{
    		System.out.println("It is a palindrome");
    			}
    	else
    	{
    		System.out.println("Not a palindrome");
    	}
    }

	public static void main(String[] args) {
//		reverse();
		usingspilt();

	}

}
