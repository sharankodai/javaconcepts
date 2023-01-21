package Programs;

public class Primenumbers {
	public static void main(String[] args) {
		for(int i=1;i<=100;i++) {
			int count=0;
			for(int j=2;j<=i/2;j++) {
			int rem=i%j;
			if(rem==0) {
//				System.out.println("Not a prime number");
				count++;
			}}
			if(count==0) {
				System.out.println(" Prime number:"+i);
			}
			}
			}
	

}
