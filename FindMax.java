package com.Bridgelabz.Generic;

public class UseGenericUC3Refactor2<T extends Comparable<T>> {
	 T first;
	 T second;
	 T third;
 public UseGenericUC3Refactor2(T x, T y, T z) {
		this.first = x;
		this.second = y;
		this.third = z;
	}
 public T maximum() {
	 return testMaximum(first,second,third);
 }
	public  <T extends Comparable<T>> T testMaximum(T first , T second, T third ){
		   T max=first;
		   if(second.compareTo(max)>0) {
				max=second;
			}
			else if(third.compareTo(max)>0) {
				max=third;
			}
		   return max;
	   }
	   public static void main(String args[]) {
		   System.out.println("Maximum value is : "+new UseGenericUC3Refactor2(10,20,5).maximum());
		   UseGenericUC3Refactor2 String=new UseGenericUC3Refactor2("Niki","Yogita","Ram");
		   System.out.println("Maximum String value is : "+ String.maximum());
		   
	   }
}
