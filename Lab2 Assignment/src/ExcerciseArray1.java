
public class ExcerciseArray1 {
	public static void main(String[] args) {
		int a[]= {3,2,1,4,5};
		getSecondSmallest(a ,3);
	}

	public static int getSecondSmallest(int[] a , int total) {
		int temp;
		for(int i=0;i<total;i++)
		{
			for(int j=i+1;j<total;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		return a[1];
	}

	
}
