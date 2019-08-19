package com.gyan.arrays;

public class AB {
	public static void main(String[] args) {
		Object []obj=new Object[10];
		System.out.println(obj.getClass().getName());
		System.out.println("=====");
		obj[0] =new String("abc");
		obj[1] =new Double(10.0);
		obj[2] =new Float(2.4);
		obj[3] =new Character('a');
		obj[4]=new Object();
		System.out.println(obj[0]);
		System.out.println(obj[1]);
		System.out.println(obj[2]);
		System.out.println(obj[3]);
		System.out.println(obj[4]);
	}

}
