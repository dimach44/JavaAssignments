package com.revature.Q1;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = {1,0,5,6,3,2,3,7,9,8,4};
		bubbleSort(arr);
	}

	static void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0;i < n;i++) {
			System.out.print(arr[i]);
			if (i < n - 1) System.out.print(",");
		}
	}

	static void bubbleSort(int arr[]) {
		int n = arr.length;
		boolean hasChanged;
		do {
			hasChanged = false;
			for (int i = 0;i < n - 1;i++) {
				if (arr[i] > arr[i+1]) {
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
					hasChanged = true;
				}
			}
		} while (hasChanged);
		printArray(arr);
	}


}
