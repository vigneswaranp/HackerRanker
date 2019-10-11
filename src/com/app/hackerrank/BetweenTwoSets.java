package com.app.hackerrank;

import java.util.ArrayList;
import java.util.List;

public class BetweenTwoSets {
	static int max = 100;
	static int gcd(int a, int b){ 
		if (b == 0) 
			return a;  
		return gcd(b, a % a);  
	} 

	static int lcm(int a, int b){ 
		return (a*b)/gcd(a, b); 
	}
	public static int getTotalX(List<Integer> a, List<Integer> b) {
		
		/*Optional<Integer> aMaxOptional = a.stream().max((i,j)->i-j);
		Optional<Integer> bMaxOptional = b.stream().max((i,j)->i-j);
		int aMax = aMaxOptional.isPresent() ? aMaxOptional.get() : 0;
		int bMax = bMaxOptional.isPresent() ? bMaxOptional.get() : 0;
		int max = aMax>bMax ? aMax/2 : bMax/2;
		for(int i=0; i<max; i++){
			for(int j=0; j<max; i++){
				
			}
		}*/
		int count = 0;
		int x = 0, y = 1;
		for(Integer i : a){
			x = lcm(x,i);
		}
		for(Integer i : b){
			y = gcd(y,i);
		}
		if(y%x==0){
			y=y/x;
			for(int i=1; i*i<=y;i++){
				if(y%i==0){
					++count;
					if(i*i!=y){
						++count;
					}
				}
			}
			return count;
		}
		return 0;

	}
	public static void main(String[] args){
		List<Integer> a = new ArrayList<Integer>();
		a.add(2);
		a.add(4);
		List<Integer> b = new ArrayList<Integer>();
		b.add(16);
		b.add(32);
		b.add(96);
		System.out.println(getTotalX(a,b));
	}
}
