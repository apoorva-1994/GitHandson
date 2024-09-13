package com.lc.amazon;

public class ReplaceElementswithGreatestElementonRightSide {

	public static void main(String[] args) {// TODO Auto-generated method stub
		int ar[] = {17,18,5,4,6,1};
		ReplaceElementswithGreatestElementonRightSide.replace(ar);
	}
	public static void replace(int ar[]) {
		for(int i = 0 ; i < ar.length ; i++) {
			if(i == ar.length - 1) {
				ar[i] = -1;
				System.out.println(ar[i]);
				break;
			}
			int max = 0;
			for(int j = i+1 ; j < ar.length ; j++) {
				if(max < ar[j]) {
					max = ar[j];
				}
			}
			ar[i] = max;
			System.out.println(ar[i]);
		}
	}

}
