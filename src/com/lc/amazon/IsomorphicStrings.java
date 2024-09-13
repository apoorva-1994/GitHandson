package com.lc.amazon;

public class IsomorphicStrings {

	public static void main(String[] args) {
		
		String s = "egg";
		String t = "apd";
		int ct = 0;
		for(int i=0;i<s.length();i++){
			if(s.indexOf(s.charAt(i))==t.indexOf(t.charAt(i)))
			ct=ct+1;
			}
		if(ct == s.length()) {
			System.out.println("true");
		}
		

	}

}
