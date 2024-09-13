package com.lc.amazon;

import java.util.Arrays;

public class MergeSortedArray {
	public static void main(String[] args) {
		int a[] = {1,2,3,0,0,0};
		int b[] = {2,5,6};
		MergeSortedArray.merge(a,b);
	}
	public static void merge(int a[], int b[]) {
		int m = 3;
		for(int i = 0 ; i < b.length ; i++) {
			a[m+i]=b[i];
		}
		Arrays.sort(a);
		for(int i = 0 ; i < a.length ; i++) {
			System.out.println(a[i]);
		}
	}
}
