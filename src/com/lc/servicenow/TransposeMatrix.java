package com.lc.servicenow;

public class TransposeMatrix {

	public static void main(String[] args) {
		
		int matrix[][] = {{1,2,3},{4,5,6},{7,8,9}};
		int ar[][] = new int[3][3];
		int row = matrix.length;
		int col = matrix[0].length;
		for(int i = 0 ; i < row ; i++) {
			for(int j = 0 ; j < col ; j++) {
				ar[j][i] = matrix[i][j];
			}
		}
		for(int i = 0 ; i < row ; i++) {
			for(int j = 0 ; j < col ; j++) {
				System.out.println(ar[i][j]);
			}
		}

	}

}
