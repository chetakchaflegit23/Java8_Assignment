package com.yash.java1;

import java.util.stream.IntStream;

public class palindrome {
	public static boolean isPalindrome(int num) 
	{
		return num == IntStream.iterate(num, i -> i / 10).map(n -> n % 10).limit(String.valueOf(num).length()).reduce(0, (a, b) -> a = a * 10 + b);
	}

	public static void main(String[] args) 
	{
		int num = 123454321;

		System.out.println(num + " is a palindrome number " + isPalindrome(num));
	}
}
