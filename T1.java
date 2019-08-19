package com.gyan.arrays;

import java.util.Arrays;

public class T1{
public static void main(String[] args) {
		 int[] x={10,20,30,40,50,5,23,9};

		System.out.println(Arrays.toString(x));
		Arrays.sort(x);
		System.out.println(Arrays.toString(x));
		int i=Arrays.binarySearch(x,25); 
		System.out.println(i);



			
}
}
