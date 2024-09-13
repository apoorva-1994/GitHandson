package com.lc.amazon;

import java.util.HashMap;
import java.util.Map;

public class HighFive {

	public static void main(String[] args) {
		int items[][] = {{1,91},{1,92},{2,93},{2,97},{1,60},{2,77},{1,65},{1,87},{1,100},{2,100},{2,76}};
		HashMap<Integer,Integer> hmap = new HashMap<>();
		int sum = 0;
		for(int i = 0 ; i < items.length ; i++) {
				int val = items[i][1];
				sum = sum + val;
				hmap.put(items[i][0], sum);
			
		}
		for(Map.Entry<Integer, Integer> ma : hmap.entrySet()) {
			int val = ma.getValue();
			val = val / 5;
			System.out.println("for key : " +ma.getKey() + " value is : "+val);
		}
	}

}
