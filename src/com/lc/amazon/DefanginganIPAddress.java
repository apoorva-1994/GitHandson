package com.lc.amazon;

public class DefanginganIPAddress {

	public static void main(String[] args) {
		String address = "1.1.1.1";
		DefanginganIPAddress.defang(address);
	}
	public static void defang(String s) {
		s = s.replaceAll("\\.", "[.]");
		System.out.println(s);
	}

}
