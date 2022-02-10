package com.Bridgelabz.Generic;

public class FindMaxInteger{
	private Integer x,y,z;  
	public FindMaximum(Integer x, Integer y, Integer z) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
	}
	public  Integer testMaximum() {
		Integer max=x;
		if(y.compareTo(max)>0) {
			max=y;
		}
		else if(z.compareTo(max)>0) {
			max=z;
		}
		return max;
	}
	public static void main(String[] args) {
		FindMaximum no=new FindMaximum(40,20,25);
		no.testMaximum();
		System.out.println("Maximum Number is :"+no.testMaximum());

	}
}
