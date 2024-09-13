package com.lc.amazon;

import java.util.Stack;

public class SortArrayByParityII {

	public static void main(String[] args) {
		int ar[] = {4,2,5,7};
		SortArrayByParityII.sort(ar);
	}
	public static void sort(int ar[]) {
		Stack<Integer> even = new Stack<Integer>();
		Stack<Integer> odd = new Stack<Integer>();
		int br[] = new int[ar.length];
		for(int i = 0 ; i < ar.length ; i++) {
			if(ar[i]%2 == 0) {
				even.push(ar[i]);
			}else {
				odd.push(ar[i]);
			}
		}
		for(int j = 0 ; j < ar.length ; j++) {
			if(j%2==0) {
				br[j] = even.pop();
			}else {
				br[j] = odd.pop();
			}
			System.out.println(br[j]);
		}
	}
}
