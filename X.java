package com.gyan.arrays;

import java.util.Arrays;

public class X {
public static void main(String[] args) {
		 int[] x={10,20,30,40,50,5,23,9};

		System.out.println(Arrays.toString(x));
		Arrays.sort(x); // for binary Search arrays must be sorted otherwise it will give junk values
		System.out.println(Arrays.toString(x));
		int i=Arrays.binarySearch(x,5); 
		System.out.println(i);
		 i=Arrays.binarySearch(x,7); 
		System.out.println(i);
		i= Arrays.binarySearch(x,4);
		System.out.println(i);
		i= Arrays.binarySearch(x,20);
		System.out.println(i);
		i= Arrays.binarySearch(x,55);
		System.out.println(i);



			
}
}


