package checkNumber;

public class checkNumber {
	public static void main(String args[]) {
		int n=8;
		if(n ==0)
			System.out.print(false); 
		while(n !=1) {
			if(n % 2 !=0)
				System.out.print(false);
			 n=n/2;
			 
		}
		System.out.print(true);
		
		
	}

}
