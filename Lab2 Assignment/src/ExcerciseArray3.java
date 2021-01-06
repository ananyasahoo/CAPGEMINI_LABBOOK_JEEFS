import java.util.Arrays;

/*
 * Author-@Ananya
 * Return the resulting array after reversing the numbers and sorting it 
 * 
 */
public class ExcerciseArray3 {
	public static void main(String[] args) {
		int arr[]= {1,5,3,6,2};
	
		getSorted(arr);

	}
	private static int getSorted(int arr[]) {
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i] +"");
		}
		return 0;
	}
	

	

}
