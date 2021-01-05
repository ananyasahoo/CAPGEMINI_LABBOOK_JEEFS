package Project1;


public class CalculateSum {
	public static void main(String[] args) {
	      
	      
			 int num,sum=0,n=100;
			 for(num=0;num<n;num++) {
				 if(num % 3 ==0 || num%5 ==0)
					sum = sum+num;
					
			 }
			 System.out.print(sum+" " );

		}


}
