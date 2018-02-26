package arrays;

public class ArrayAscendingOrder2 {
	
	public static void main(String[] args) {
		int arr[] = {3,1,5,2,4};
		int temp;
		//ascending the array elements
		for(int i=0; i<arr.length; i++){
			for(int j=i+1; j<arr.length; j++){
				if(arr[i]>arr[j]){
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		//print array elements
		for(int k=0; k<arr.length; k++){
			System.out.println(arr[k]);
		}
		
	}

}
