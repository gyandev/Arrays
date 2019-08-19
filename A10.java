package com.gyan.arrays;
public class A10 {
		
		public static void sum(int[]x)
		{
			int total=0;
			for(int x1:x)
			{
				total=total+x1;
			} 
			System.out.println(total);
		}
		
	public static void main(String[] args) {
		sum(new int[]{10,20,30,40});

}

}


