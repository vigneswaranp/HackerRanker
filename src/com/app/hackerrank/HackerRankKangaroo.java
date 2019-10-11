package com.app.hackerrank;

public class HackerRankKangaroo {
	static String kangaroo(int x1, int v1, int x2, int v2) {
		if(x2>x1 && v2>=v1){
			return "NO";
		}
		long firstEndPoint = x1;
		long secondEndPoint = x2;
		while(firstEndPoint<=secondEndPoint){
			if(firstEndPoint==secondEndPoint){
				return "YES";
			}
			firstEndPoint+=v1;
			secondEndPoint+=v2;
			
		}
		return "NO";
    }
	public static void main(String args[]){
		int x1=43;
		int v1=2;
		int x2=70;
		int v2=2;
		System.out.println(kangaroo(x1, v1, x2, v2));
	}
}
