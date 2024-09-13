package com.lc.amazon;

import java.util.Stack;

public class ValidParenthesis {

	public static void main(String[] args) {
		
		String s1 = "(]";
		Stack<Character> stack = new Stack<Character>();
		for(int i = 0 ; i < s1.length() ; i++) {
			if(s1.charAt(i)=='(' || s1.charAt(i)=='{' || s1.charAt(i)=='[') {
				stack.push(s1.charAt(i));
			}else if(s1.charAt(i) == ')' && stack.peek() == '(') {
				stack.pop();
			}
			else if(s1.charAt(i) == '}' && stack.peek() == '{') {
				stack.pop();
			}
			else if(s1.charAt(i) == ']' && stack.peek() == '[') {
				stack.pop();
			}
		}
		if(stack.isEmpty() == true) {
			System.out.println("valid parenthesis");
		}else {
			System.out.println("Invalid parenthesis");
		}

	}

}
