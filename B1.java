package com.gyan.arrays;

public class B1 {
	public static void main(String[] args) {
		 int []x={10,20,30,40};
		 char []ch={'a','b','c','d'};
//		 int []c=ch; //element level promotion is not vallid at array level
		 
		 int []x1={10,20,30,40,50};
		 int []x2={60,70};
		 	x1=x2;
		 	x2=x1;
		 System.out.println("done");
		 
		
	}

}
