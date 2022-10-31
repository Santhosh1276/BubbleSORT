package Sort;

public class Sort {
	public static void  bubble(int[] arr) {
		for(int i=1;i<arr.length;i++) {
			for(int j=0;j<arr.length-i;j++) {
				int temp;
				if(arr[j]>arr[j+1]) {
					temp =arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}

}
