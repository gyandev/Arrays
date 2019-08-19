package com.gyan.arrays;

public class A9 {
	public static void main(String[] args) {
		int[] x = new int[2];
		int[] y = new int[8];
		x = y;
		y = x;
		System.out.println("done");
	}

}
