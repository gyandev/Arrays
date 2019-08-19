package com.gyan.arrays;

public class B2 {

	public static void main(String[] args) {
		
		int [][]x=new int[3][];
		int [][]y=new int[4][3];
		System.out.println(x);
		 System.out.println(y);
		y[0][0]=10;
		y[0][1]=20;
		y[0][2]=30;
		System.out.println(y[0][0]);
		System.out.println(x[2][1]);
		System.out.println(y[2][1]);
	}
}
