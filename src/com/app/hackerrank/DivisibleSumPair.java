package com.app.hackerrank;

public class DivisibleSumPair {
	static int divisibleSumPairs(int n, int k, int[] ar) {
        int count = 0;
        for(int i=0; i<n;i++){
            for(int j=i+1;j<n;j++){
                if((ar[i]+ar[j])%k==0){
                    count++;
                }
            }
        }
        return count;
    }
	public static void main(String[] args){
		int[] ar = {1, 3, 2, 6, 1, 2};
		System.out.println(divisibleSumPairs(ar.length, 3, ar));
	}

}
