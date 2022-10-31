package Sort;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int[] arr = {3,2,6,4,7,9,1};

		Sort.bubble(arr) ;
		System.out.println(Arrays.toString(arr));
		System.out.println("smallest element in an array " + arr[0]);
		System.out.println("Second smallest element in an array " + arr[1]);
		
	}

}

