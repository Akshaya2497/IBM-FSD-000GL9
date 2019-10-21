package array;
import java.util.Arrays;

public class MyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {100,20,5,0,15,-5};
		/*for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[i]) {
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]= temp;
					
				}
			}
			System.out.println(arr[i]);
		}*/
		//System.out.println(arr);
		//search
		Arrays.sort(arr);
		int toFind = 15;
		
		int s=0;
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
			/*if(arr[i]==toFind) {
				System.out.println("Item found");
				
			}*/
			
		}
		s=Arrays.binarySearch(arr,toFind);
		System.out.println(s);
		if(s<arr.length)
			System.out.println("Item Found");
		else
			System.out.println("Item not Found");
			
	}
	

	

}
