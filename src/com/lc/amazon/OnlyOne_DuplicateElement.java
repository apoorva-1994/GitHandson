package com.lc.amazon;

public class OnlyOne_DuplicateElement {

	public static void main(String[] args) {
		int ar[] = {1,6,4,6,2};
		int slow = 0;
		int fast = 0;
		do {
			slow = ar[slow];
			fast = ar[ar[fast]];
		}while(slow != fast);
		
		slow = 0;
		while(slow != fast){
			slow = ar[slow];
			fast = ar[fast];
		}
		System.out.println(slow);
	}

}
