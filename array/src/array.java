

public class array {
	public int findMind (int arr[], int n) {
		int min =arr[0];
		for (int i = 0; i < n; i++) {
			if (min >arr[i]) {
				min =arr[i];
			}
		}
		return min;
	}
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		//for thuong
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("------------------");
		//for object
		for (int item : arr) {
			System.out.println(item);
		}
		
		System.out.println("---------min max-----------");
		int n= arr.length;
		array a = new array();
		int min = a.findMind(arr, n);
		System.out.println("min = "+min);
	}		
}
