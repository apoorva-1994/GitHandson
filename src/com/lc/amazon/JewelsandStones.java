package com.lc.amazon;

public class JewelsandStones {

	public static void main(String[] args) {
		String jewels = "z";
		String stones = "ZZ";
		JewelsandStones.jest(jewels, stones);

	}
	public static void jest(String je, String st) {
		int ct = 0;
		for(int i = 0 ; i < je.length() ; i++) {
			for(int j = 0 ; j < st.length() ; j++) {
				if(je.charAt(i) == st.charAt(j)) {
					ct++;
				}
			}
		}
		System.out.println(ct);
	}
}
