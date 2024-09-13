package com.lc.amazon;

public class RunningSumof1dArray {

	public static void main(String[] args) {
		int nums[] = {1,1,1,1,1};
		RunningSumof1dArray.running(nums);
	}
	public static void running(int nums[]) {
		int b[] = new int[nums.length];
		for(int i = 0 ; i < nums.length ; i++) {
			int j = 0;
			int sum = 0;
			while(i >= j) {
				sum = sum + nums[j];
				j++;
			}
			b[i] = sum;
			System.out.println(b[i]);
		}
	}
}
