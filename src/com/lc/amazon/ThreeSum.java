package com.lc.amazon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum {
	
	public static List<List<Integer>>  sum(int ar[]){
        Arrays.sort(ar);
        List<List<Integer>> list = new ArrayList<>();
        if(ar == null)
        return list;
        for(int i = 0  ; i < ar.length - 2 ; i++){
           int left = ar[i+1];
           int right = ar[ar.length - 1];
           while(left < right){
               int sum = ar[i] + left + right;
               if(sum == 0){
                   list.add(Arrays.asList(ar[i],left,right));
                   left++;
                   right--;
               }else if(sum < 0){
                   left++;
               }else{
                   right++;
               }
           }
       }
       return list;
   }
	
	public static void main(String[] args) {
		
		List<List<Integer>> list = new ArrayList<>();
		int ar[] = {-1,0,1,2,-1,-4};
		list = sum(ar);
		System.out.println(list);
	}

}
