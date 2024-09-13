package com.lc.amazon;

public class NumberofStepstoReduceaNumbertoZero {

	public static void main(String[] args) {
		int num = 8;
		int steps = 1;
		num = num / 2 ;
		while(num != 0) {
			if(num % 2 != 0) {
				num = num - 1;
				steps++;
				
			}else {
				num = num / 2;
				steps++;
			}
		}
		System.out.println(steps);
	}

}
