package com.Bridgelabz.Generic;

public class FindMaxFloat {
	private Float x,y,z;
	public FindMaxFloat(Float x, Float y,Float z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	public  Float testMaximum() {
		Float max=x;
		if(y.compareTo(max)>0) {
			max=y;
		}
		else if(z.compareTo(max)>0) {
			max=z;
		}
		return max;
	}
	public static void main(String[] args) {
		FindMaxFloat no=new FindMaxFloat(8.4f,5.4f,9.6f);
		no.testMaximum();
		System.out.println("Maximum Number is :"+no.testMaximum());
	}
}
