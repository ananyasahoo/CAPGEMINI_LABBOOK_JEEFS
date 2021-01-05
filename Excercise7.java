
public class checkIncreasenumber {

	public static void main(String[] args) {
		int input=28;
		if(input <0)
			input = -input;
		int lastseen=10;
		int current;
		while(input>0) {
			current= input % 10;
			if(lastseen < current)
				System.out.print(false);
			lastseen = current;
			input /=10;
			
		}
     System.out.print(true);
	}

}
