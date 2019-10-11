package com.app.hackerrank;

import java.util.Arrays;
import java.util.List;

public class BirthdayChocolate {
	static int birthday(List<Integer> s, int d, int m) {
		int count = 0;
		int sum=0;
		for(int i=0; i<=s.size()-m; i++){
			sum = 0;
			for(int j=i; j<i+m; j++){
				sum+=s.get(j); 
			}
			if(sum==d){
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args){
		Integer [] a = {2, 5, 1, 3, 4, 4, 3, 5, 1, 1, 2, 1, 4, 1, 3, 3, 4, 2, 1};
		List<Integer> s = Arrays.asList(a);

		System.out.println(birthday(s,18,7));
	}
}
