package com.lc.servicenow;

import java.util.Arrays;

public class Sum3 {

	public static void main(String[] args) {
		int nums[] = {-1,0,1,2,-1,-4};
		Arrays.sort(nums);
		for(int i = 0 ; i < nums.length - 2 ; i++) {
			int left = nums[i+1];
			int right =  nums[nums.length - 1];
			while(left < right) {
				int sum = left + right + nums[i];
				if(sum == 0) {
					System.out.println(left + " " + right + " " + nums[i]);
					left++;
					right--;
				}
				else if(sum <  0) {
					left++;
				}
				else {
					right++;
				}
			}
		}
	}
}
