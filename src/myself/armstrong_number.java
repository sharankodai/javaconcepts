package myself;

public class armstrong_number {
	public static void main(String[] args) {
		int a=153;
		int temp=a;
		int sum=0;
		while(a>0) {
			int rem=a%10;
			sum=sum+(rem*rem*rem);
			a=a/10;
		}
		if(sum==temp) {
			System.out.println("The given numaber is a armstrong number: "+a);
		}
		else
		{
			System.out.println("It is not a armstrong number");
		}
		
		
		
	
	}

}
