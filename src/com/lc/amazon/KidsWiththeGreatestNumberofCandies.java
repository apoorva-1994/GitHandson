package com.lc.amazon;

public class KidsWiththeGreatestNumberofCandies {

	public static void main(String[] args) {
		int candies[] = {12,1,12};
		KidsWiththeGreatestNumberofCandies.noofcan(candies, 10);
	}
	public static void noofcan(int ar[], int k) {
		boolean b[] = new boolean[ar.length];
		for(int i = 0 ; i < ar.length ; i++) {
			int sum = k + ar[i];
			for(int j = 0 ; j < ar.length ; j++) {
				if(i == j) {
					continue;
				}
				else if(sum < ar[j]) {
					b[i] = false;
					break;
				}
				else if(sum > ar[i]) {
					b[i] = true;
				}
			}
			System.out.println(b[i]);
		}
	}

}
