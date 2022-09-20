package com.yash.java7;

public class EmiCalculation 
{
	public static void main(String[] args) {

	       Result r = new Result();
	        Calculate c;
	        double d = 0;
	        c = r.emiCalculation();

	       d = r.input(c, 1800, 20, 22, 10);
	       System.out.println(d);
	   }


}
