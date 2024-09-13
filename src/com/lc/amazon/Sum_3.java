package com.lc.amazon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sum_3 {

	public static void main(String[] args) {
		int ar[] = {-1,0,1,2,-1,-4};
		Arrays.sort(ar); // -4,-1,-1,0,1,2
		List<List<Integer>> list = new ArrayList();
		for(int i = 0 ; i <ar.length - 2 ; i++) {
			int left = ar[i+1];
			int right = ar[ar.length - 1];
			while(left < right) {
				int sum = ar[i]+left+right;
				if(sum == 0) {
					list.add(Arrays.asList(ar[i],left,right));
				//	System.out.println(ar[i] + " " + left + " " + right);
					left++;
	                right--;
				}
				else if(sum < 0) {
					left++;
				}else {
					right++;
				}
			}
		}
		System.out.print(list);

	}

}
