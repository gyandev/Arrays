package com.gyan.arrays;
import java.util.*;

public class Y {
public static void main(String[] args) {
		 String[] x={"hello","blue","orange","yellow","white","pink","java"};

		System.out.println(Arrays.toString(x));
		Arrays.sort(x); // for binary Search arrays must be sorted otherwise it will give junk values
		System.out.println(Arrays.toString(x));
		int i=Arrays.binarySearch(x,"abc"); 
		System.out.println("abc :" +i);
		 i=Arrays.binarySearch(x,"orange"); 
		System.out.println("orange :" +i);
		i= Arrays.binarySearch(x,"red");
		System.out.println("red :" +i);
		






			
}
}

