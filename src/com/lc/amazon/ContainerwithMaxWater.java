package com.lc.amazon;

public class ContainerwithMaxWater {

	public static void main(String[] args) {
		
		int ar[] = {1,1};
		int left = 0;
		int right =  ar.length - 1;
		int max_area = 0;
		while(left < right) {
			int area = Math.min(ar[left], ar[right]) * (right - left);
			max_area = Math.max(area, max_area);
			if(ar[left] < ar[right]) {
				left++;
			}else {
				right--;
			}
		}
		System.out.println(max_area);
	}

}
