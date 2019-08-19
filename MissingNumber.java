package com.gyan.arrays;

import java.util.Arrays;

public class MissingNumber {
	private static int getMissingNumber(int[] numbers, int totalCount) {
        int expectedSum = (totalCount) * (totalCount + 1) / 2;
        int actualSum = 0;
        for (int i : numbers) {
            actualSum += i;
        }
 
        return expectedSum - actualSum;
    }
	public static void main(String[] args) {
		
	
 
//	int[] iArray = new int[]{1, 2, 3, 5,6,7,8,9,10};
 //   int missing = getMissingNumber(iArray, 10);
		int missing=getMissingNumber(new int[] {1,2,3,5,6,7,8,9,10},10);
    System.out.println("Missing number in array: "  + " is ,"+ missing);
    
	}
	}

