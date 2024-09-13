package com.lc.amazon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GA {
	
	public static String convertkey(String ss) {
		String hh = "";
		StringBuilder sb = new StringBuilder();
		HashMap<Character,Integer> hm = new HashMap<>();
		for(int i = 0 ; i < ss.length() ; i++) {
			if(hm.containsKey(ss.charAt(i))) {
				hm.put(ss.charAt(i), hm.get(ss.charAt(i))+1);
			}else {
				hm.put(ss.charAt(i), 1);
			}
		}
		for(Map.Entry<Character, Integer> mm : hm.entrySet()) {
			hh = sb.append(mm.getKey()).append(mm.getValue()).toString();
		}
		return hh;
	}

	public static void main(String[] args) {
	 
		String arr[] = {"ate","tea","silent","listen","bob","eat"};
		HashMap<String,List<String>> hmap = new HashMap<>();
		for(String str : arr) {
			String tt = convertkey(str);
			System.out.println(tt);
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
