package arrays;

public class ArrayDecendingOrder {
	
	public static void main(String[] args) {
		Comparable<T>
		int arr[] = {1,3,5,2,4};
		int temp;
		
		for(int i=0; i<arr.length; i++){
			for(int j=i+1; j<arr.length; j++){
				if(arr[i]<arr[j]){
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		for(int k=0; k<arr.length; k++){
			System.out.println(arr[k]);
		}
	}

}
