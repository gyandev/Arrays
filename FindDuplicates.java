package com.gyan.arrays;

import java.util.HashSet;

public class FindDuplicates 
{
	public static void main(String[] args)
	{
		int a[]= {1,1,2,3,4,5,8,7,7};
		HashSet hs=new HashSet();
		for(int a1:a)
		{
			if(hs.add(a1)==false)
			{
				System.out.println(a1);
			}
		}
		
	}

}
