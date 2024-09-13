package com.lc.amazon;

import java.util.ArrayList;
import java.util.List;

public class DuplicateElements {

	public static void main(String[] args) {
		int ar[] = {3,6,1,5,3,6,6,1};
		List<Integer> list = new ArrayList<>();
		for(int i = 0 ; i < ar.length ; i++) {
			int index = Math.abs(ar[i]) - 1;
			if(ar[index] < 0) {
				list.add(index + 1);
			}
			ar[index] = ar[index] * -1;
		}
		System.out.print(list);
	}

}
