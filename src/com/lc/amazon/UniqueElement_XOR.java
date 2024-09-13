package com.lc.amazon;

public class UniqueElement_XOR {

	public static void main(String[] args) {
		
		int ar[] = {3,5,7,3,7,9,9,5};
		int sin = ar[0];
		for(int i = 1 ; i < ar.length ; i++) {
			sin = sin ^ ar[i];
		}
		System.out.println(sin);
	}

}
