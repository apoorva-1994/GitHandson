package com.lc.amazon;

import java.util.HashMap;

public class UniqueChar {
	
	public static int ind(String ss){
        int index = -1;
        HashMap<Character,Integer> hmap = new HashMap<>();
        for(int i = 0 ; i < ss.length() ; i++){
            if(hmap.containsKey(ss.charAt(i))){
                hmap.put(ss.charAt(i),hmap.get(ss.charAt(i))+1);
            }else{
                hmap.put(ss.charAt(i),1);
            }
        }
        for(int i = 0 ; i < ss.length() ; i++){
            if(hmap.get(ss.charAt(i)) == 1){
                index = i ;
                return index;
            } 
        }
       return index;
    }

	public static void main(String[] args) {
		 String ss= "aabb";
	     System.out.println(ind(ss));

	}

}
