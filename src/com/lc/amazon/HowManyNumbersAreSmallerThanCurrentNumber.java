package com.lc.amazon;

public class HowManyNumbersAreSmallerThanCurrentNumber {

	public static void main(String[] args) {
		
		int arr[] = {8,1,2,2,3};
		for(int i = 0 ; i < arr.length ; i++) {
			int ct = 0;
			for(int j = 0 ; j < arr.length ; j++) {
				 if(arr[j] < arr[i]) {
					ct++;
				}
				
			}
			 arr[i] = ct ;
			System.out.println(arr[i]);
		}

	}

}
