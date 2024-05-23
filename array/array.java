package array;

import java.util.Arrays;


class secondlargestNumber{
	
	public static void print2largest (int arr[]) {
		int size = arr.length;
		if(size<2) {
			System.out.println("invalid input");
			return;
		}
		Arrays.sort(arr);
		for(int i = size-2;i>=0;i--) {
			if(arr[i]!=arr[size-1]) {
				System.out.print("the second largest element is" + arr[i]);
				return;
			}
		}
		System.out.println("there is no second largest element.");
	}
public static void main(String[] args) {
		// TODO Auto-generated method stub
	int arr[] = {1,4,6,36,34};
	print2largest(arr);

	}

}