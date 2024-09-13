package com.lc.amazon;

public class MaxConsecutiveOnes {

	public static void main(String[] args) {
		
		int arr[] = {1,1,0,1,1,1};
		int count  = 0;
		for(int i = 0 ; i < arr.length -1 ; i++) {
			for(int j = i+1 ; j < arr.length ; j++) {
				if(arr[i] == 1 && arr[j] == 1 && j == i+1) {
					count++;
				}else {
					break;
				}
			}
		}
		System.out.println(count);
	}

}
