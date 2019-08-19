package com.gyan.arrays;

public class A5 {
	public static void main(String[] args) {
		int[] x=new int[4];
		int n=x.length;
		System.out.println(x.length);
		System.out.println("-----");
		for(int x1 : x)
		{
			System.out.println(x1);
		}
		System.out.println("------");
		for(int i=0;i<n;i++)
		{
			System.out.println(x[i]);
		}

		
	}

}


