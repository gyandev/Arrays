package com.gyan.arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ABC {
	public static void main(String[] args) {
		Runnable []obj=new Runnable[10];
		List []l=new List[10];
	//	l[0]=new List();
		l[1]=new ArrayList();
		l[2]=new Vector();
		System.out.println(obj.getClass().getName());
		System.out.println("=====");
//		obj[0] =new Runnable();
		obj[1]=new Thread();
	
		System.out.println(obj[0]);
		System.out.println(obj[1]);
		System.out.println(obj[2]);
		System.out.println(obj[3]);
		System.out.println(obj[4]);
	}

}
