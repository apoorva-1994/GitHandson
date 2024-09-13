package com.lc.amazon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class GroupAnagrams {
	
	
	public static String convertStringtoKey(String ss2) {
		
			String ss = "";
			StringBuilder sb = new StringBuilder();
			HashMap<Character,Integer> hmap = new HashMap<Character,Integer>();
			for(int i = 0 ; i < ss2.length() ; i++) {
				if(hmap.containsKey(ss2.charAt(i))) {
					hmap.put(ss2.charAt(i), hmap.get(ss2.charAt(i))+1);
				}else {
					hmap.put(ss2.charAt(i), 1);
				}
			}
			for(Map.Entry<Character, Integer> mp : hmap.entrySet()) {
			 ss = sb.append(mp.getKey()).append(mp.getValue()).toString();
			 
			}
			System.out.println(ss);
			return ss;
		}

	public static void main(String[] args) {
		
		String arr[] = {"ate","tea","silent","listen","bob","eat"};
		HashMap<String,List<String>> hmap = new HashMap<String,List<String>>();
		for(String str : arr) {
			String tt = convertStringtoKey(str);
			if(hmap.containsKey(tt)) {
				hmap.get(tt).add(str);
				
			}else {
				List<String> st = new ArrayList<>();
				st.add(str);
				hmap.put(tt, st);
			}
		}
		for(Map.Entry<String,List<String>> mp : hmap.entrySet() ) {
			System.out.print(mp.getValue());
		}
	}

}
