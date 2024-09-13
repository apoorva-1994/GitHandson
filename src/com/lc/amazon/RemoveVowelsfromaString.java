package com.lc.amazon;

public class RemoveVowelsfromaString {

	public static void main(String[] args) {
		String s = "leetcodeisacommunityforcoders";
		RemoveVowelsfromaString.remove(s);
	}
	
	public static void remove(String s) {
		s= s.replaceAll("[aeiou]","");
		System.out.println(s);
	}

}
