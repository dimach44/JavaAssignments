package com.revature.Q2;

import java.util.ArrayList;

public class Fibonacci {
	
	public static void main(String[] args) {
		doFib(25);
	}
	
	static void doFib(int n) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(1);
		int temp = 1;
		for (int i = 0;i < n-1;i++) {
			arr.add(temp);
			temp += arr.get(i);
		}
		System.out.println(arr);
	}
	
}
