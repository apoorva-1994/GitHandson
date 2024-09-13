package com.lc.amazon;

import java.util.Arrays;

public class SingleNumber {

	public static void main(String[] args) {
		int nums[] = {4,1,2,1,2};
		SingleNumber.single(nums);
	}
	public static void single(int ar[]) {
		Arrays.sort(ar);
		int ct = 0;
		int num = 0;
		for(int i = 0 ; i < ar.length -1; i=i+2) {
			if(ar[i] < ar[i+1]) {
				ct++;
				num = ar[i];
				break;
			}
		}
		if(ct == 0) {
			num = ar[ar.length-1];
		}
		System.out.println(num);
	}

}
