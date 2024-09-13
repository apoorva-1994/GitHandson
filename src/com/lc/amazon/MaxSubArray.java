package com.lc.amazon;

public class MaxSubArray {

	public static void main(String[] args) {
		int ar[] = {-2,13,1,-9,4,6};
		int curr_max = ar[0];
		int max_so_far = ar[0];
		for(int i = 1 ; i < ar.length ; i++) {
			curr_max = Math.max(ar[i],ar[i]+curr_max);
			max_so_far = Math.max(max_so_far,curr_max);
		}
		System.out.println(max_so_far);
	}

}
