package com.lc.amazon;

public class ReverseWordsinaStringIII {

	public static void main(String[] args) {
		String ss = "Let's take LeetCode contest";
		ReverseWordsinaStringIII.reverse(ss);
	}
	public static void reverse(String ss) {
		String ss1[] = ss.split("\\s");
		for(int i = 0 ; i < ss1.length ; i++) {
			String tt = ss1[i];
			for(int j = tt.length()-1 ; j >= 0 ; j--) {
				System.out.print(tt.charAt(j));
			}
			System.out.print(" ");
		}
	}

}
