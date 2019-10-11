package com.app.hackerrank;

import java.util.stream.IntStream;

public class HackerRankSamTree {

	static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
		
		long appleCount = IntStream.of(apples)
		.filter(apple->{ int f = a+apple; return f >= s && f <= t;})
		.count();
		long orangeCount = IntStream.of(oranges)
		.filter(orange->{ int f = b+orange; return f >= s && f <= t;})
		.count();
		System.out.println("Number of Apple fallen: " + appleCount);
		System.out.println("Number of Orange fallen: " + orangeCount);
	}

	public static void main(String args[]){
		int s=7;
		int t=11;
		int a=5;
		int b=15;
		int[] apples = {-2,2,1};
		int[] oranges = {5,-6};
		countApplesAndOranges(s, t, a, b, apples, oranges);
	}
}
