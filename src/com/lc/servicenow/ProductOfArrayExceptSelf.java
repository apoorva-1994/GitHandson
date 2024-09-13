package com.lc.servicenow;

public class ProductOfArrayExceptSelf {

	public static void main(String[] args) {
		int nums[] = {-1,1,0,-3,3};
		int ar[] = new int[nums.length];
		for(int i = 0 ; i < ar.length ; i++) {
			int prod = 1;
			for(int j = 0 ; j < ar.length ; j++) {
				if(i != j) {
					prod = prod * nums[j];
				}
			}
			ar[i] = prod;
			System.out.println(ar[i]);
		}

	}

}
