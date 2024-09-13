package com.lc.servicenow;

import java.util.HashMap;

public class TwoSum {

	public static void main(String[] args) {
		
		int nums[] = {3,3,2,4,3,3};
		int target = 6;
		HashMap<Integer,Integer> hmap = new HashMap<Integer,Integer>();
		for(int i = 0 ; i < nums.length ; i++) {
			if(hmap.containsKey(nums[i])) {
				System.out.println(hmap.get(nums[i]) + " " + i);
				
			}else {
				hmap.put(target-nums[i], i);
			}
		}
	}

}
