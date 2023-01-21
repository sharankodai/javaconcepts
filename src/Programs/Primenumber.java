package Programs;

public class Primenumber {
	public static void main(String[] args) {
		int a=7;
		int count=0;
		for(int i=2;i<a;i++) {
			int rem=a%i;
			
			if (rem==0) {
				count++;
				System.out.println("Not prime number"+a +" " +count);
			}
		}
				System.out.println("It is Prime Number :"+a +" "+count);
			
		}
	}


