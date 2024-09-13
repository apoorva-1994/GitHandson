package com.lc.servicenow;

import java.util.Arrays;

public class RemoveDuplicatesfromSortedArray {

	public static void main(String[] args) {
		
		int ar[] = {2,3,5,2,6,4,3};
		Arrays.sort(ar);
		int temp[] = new int[ar.length];
		int j = 0;
		for(int i = 0 ; i < ar.length -1 ; i++) {
			if(ar[i] != ar[i+1]) {
				temp[j] = ar[i];
				j++;
			}
		}
		temp[j++] = ar[ar.length - 1];
		for(int i = 0 ; i < j ; i++) {
			System.out.println(temp[i]);
		}
	}
}
