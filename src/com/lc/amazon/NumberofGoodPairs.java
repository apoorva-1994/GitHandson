package com.lc.amazon;

public class NumberofGoodPairs {

	public static void main(String[] args) {
		int nums[] = {1,2,3};
		NumberofGoodPairs.good(nums);
	}
	public static void good(int ar[]) {
		int ct = 0;
		for(int i = 0 ; i < ar.length ; i++) {
			for(int j = i + 1 ; j < ar.length ; j++) {
				if(ar[i] == ar[j]) {
					ct++;
				}
			}
		}
		System.out.println(ct);
	}

}
