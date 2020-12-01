package lesson201130;

import java.util.Arrays;

public class ArraysClassUsage {
	
	public static void main(String[] args) {
		
		int[] a = {10, 4, 17, 0, -1, 34};
		
		System.out.println(Arrays.toString(a));
		
		Arrays.sort(a);
		
		System.out.println(Arrays.toString(a));
		
		int index = Arrays.binarySearch(a, 10);
		System.out.println(index);
		
		System.out.println(a[index]);
		
		System.out.println(Arrays.binarySearch(a, 9));
		System.out.println(Arrays.binarySearch(a, -10));
		
		int[] b = insert(a, 9, 3);
		
		System.out.println(Arrays.toString(b));
		
	}

	private static int[] insert(int[] arr, int val, int key) {
	// TODO Auto-generated method stub
	int[] newArr = new int[arr.length + 1];
	
	for (int i = 0; i < arr.length; i++) {
		newArr[i] = arr[i];  //setting array elements from initial to the output array 
	}
	
	if(key>arr.length-1) {
		newArr[arr.length] = val;  //case when index is greater than array length
	}
	else {
		for(int j = arr.length; j > key; j--) {
			newArr[j] = newArr[j-1]; //shift elements above index to the right 
		}
		newArr[key] = val; // set the value to the index element
	}
	
	return newArr; //output
	
}

}
