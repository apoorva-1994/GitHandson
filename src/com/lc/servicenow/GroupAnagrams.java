package com.lc.servicenow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {
	
	public static String converttoHash(String ss) {
		HashMap<Character, Integer> hm = new HashMap<>();
		StringBuilder sb = new StringBuilder();
		String dd = "";
		for(int i = 0 ; i < ss.length() ; i++ ) {
			if(hm.containsKey(ss.charAt(i))){
				hm.put(ss.charAt(i), hm.get(ss.charAt(i))+1);
			}else {
				hm.put(ss.charAt(i), 1);
			}
		}
		for(Map.Entry<Character, Integer> mm : hm.entrySet()) {
			dd = sb.append(mm.getKey()).append(mm.getValue()).toString();
		}
		return dd;
	}
	
	public static List<List<String>> grp(String arr[]){
		HashMap<String,List<String>> hml = new HashMap<>();
		List<List<String>> lss = new ArrayList<>();
		for(String ss : arr) {
			String tt = converttoHash(ss);
			if(hml.containsKey(tt)) {
				hml.get(tt).add(ss);
				
			}else {
				List<String> ls = new ArrayList<>();
				ls.add(ss);
				hml.put(tt, ls);
			}
		}
		for(Map.Entry<String,List<String>> mp : hml.entrySet()) {
			lss.add(mp.getValue());
		}
		return lss;
	}

	public static void main(String[] args) {
		String arr[] = {"ate","tea","silent","listen","bob","eat"};
		
		 System.out.println(grp(arr));
	}
}
