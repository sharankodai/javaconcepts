package Programs;

public class revstr {
	public  void usingchararray() {
		String a ="sharan";
		char[] c = a.toCharArray();
		for(int i=c.length-1;i>=0;i--) {
			System.out.print(c[i]);
			
		}
	}
	public static void main(String[] args) {
		revstr r = new revstr();
		r.usingchararray();
		
	}

}
