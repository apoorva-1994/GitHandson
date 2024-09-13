package com.lc.servicenow;

public class MinimumAddtoMakeParenthesesValid {

	public static void main(String[] args) {
		
		String s = "(((";
		int ct = 0;
		for(int i = 0 ; i < s.length() ; i++) {
			if(s.charAt(i) == '(') {
				ct++;
			}
			else if(s.charAt(i) == ')') {
				ct--;
			}
		}
		System.out.print(Math.abs(ct));

	}

}
