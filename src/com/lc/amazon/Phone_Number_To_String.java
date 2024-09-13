package com.lc.amazon;

import java.util.LinkedList;

public class Phone_Number_To_String {

	public static void main(String[] args) {
		
			String ss = "34";
	        LinkedList<String> list = new LinkedList<String>();
	        list.add("");
	        String mm [] = new String[]{"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
	        for(int i = 0 ; i < ss.length() ; i++){
	            int x = Character.getNumericValue(ss.charAt(i));
	            while(list.peek().length() == i){
	                String ii = list.remove();
	                for(char c : mm[x].toCharArray()){
	                    list.add(ii+c);
	                }
	            }
	        }
	        System.out.println(list);
	    }
		
	}


