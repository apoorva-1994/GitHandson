package com.lc.amazon;

public class NoOfIslands {
	
	public static void tt(int ar[][], int i , int j) {
		if(i<0 || j < 0 || i >= ar.length || j >= ar[0].length)
			return;
		if(ar[i][j]==0)
			return;
		
		ar[i][j]=0;
		tt(ar,i+1,j);
		tt(ar,i-1,j);
		tt(ar,i,j+1);
		tt(ar,i,j-1);
	}

	public static void main(String[] args) {
		int ar[][] = {{1,1,1,1,0},
					  {1,0,0,0,0},
					  {1,0,1,0,0},
					  {0,0,0,1,0},
						};
		int ct = 0;
		for(int i = 0  ; i < ar.length ;i++) {
			for(int j = 0 ; j< ar[0].length ; j++) {
				if(ar[i][j] == 1) {
					tt(ar,i,j);
					ct++;
				}
			}
		}
		System.out.println(ct);

	}

}
