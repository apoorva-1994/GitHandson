package com.lc.servicenow;

import java.util.HashMap;

public class FirstUniqueCharacterinaString {

	public static void main(String[] args) {
		
		String s = "leelcode";
		HashMap<Character,Integer> hm = new HashMap<>();
		for(int i = 0 ; i < s.length() ; i++) {
			if(hm.containsKey(s.charAt(i))) {
				hm.put(s.charAt(i), hm.get(s.charAt(i))+1);
				
			}else {
				hm.put(s.charAt(i), 1);
			}
		}
		
		for(int i = 0 ; i < s.length(); i++) {
			
			if(hm.get(s.charAt(i)) == 1) {
				System.out.print(i);
				break;
			}
			
		}
		
	}

}
