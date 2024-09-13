package com.lc.amazon;

class SortArrayByParity {

	public static void main(String[] args) {
		
		int arr[] = {3,1,2,4};
		int i = 0;
		for(int j = 0 ; j < arr.length ; j++) {
			if(arr[j] % 2 == 0) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
			}
		
		}
		for(int k = 0 ; k < arr.length ; k++) {
			System.out.println(arr[k]);
		}
	}	
	}
