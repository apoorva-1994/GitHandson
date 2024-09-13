package com.lc.servicenow;

import java.util.LinkedList;

public class Phone_Number_To_String {

	public static void main(String[] args) {
	
		String s = "34";
		String mm [] = new String[]{"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
		LinkedList<String> ls = new LinkedList<>();
		ls.add("");
		for(int i = 0 ; i < s.length() ; i++) {
			int a = Character.getNumericValue(s.charAt(i));
			while(ls.peek().length() == i) {
				String rr = ls.remove();
				for(char c : mm[a].toCharArray()) {
					ls.add(rr+c);
				}
			}
		}
		System.out.print(ls);
	}
}
