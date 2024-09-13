package com.lc.servicenow;

public class MissingNumber {

	public static void main(String[] args) {
		
		int nums[] = {3,0,1};
		int sum = 0;
		int exp = 0;
		for(int i = 0 ; i < nums.length; i++) {
			sum =  sum + nums[i];
		}
		for(int i =  0 ; i < nums.length + 1 ; i++) {
			exp = exp + i;
		}
		System.out.println(exp - sum);
	}

}
