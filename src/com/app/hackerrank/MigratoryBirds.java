package com.app.hackerrank;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class MigratoryBirds {
	
	static int migratoryBirds(List<Integer> arr) {
		Map<Integer,Integer> m = new HashMap<>();
		arr.stream().forEach(i->{
			if(m.get(i)!=null){
				int v = m.get(i)+1;
				m.put(i, v);
			}else{
				m.put(i, 1);
			}
		});
		
		int count = 0;
		for(Integer i : m.keySet()){
			if(count<m.get(i)){
				count = m.get(i);
			}
		}
		return findMin(m,count);
    }
	static int findMin(Map<Integer,Integer> m, int count){
		Optional<Integer> opt = m.keySet().stream().filter(i->{
			return m.get(i)==count;
		})
		.min((a,b)->a-b);
		return opt.isPresent() ? opt.get() : 0;
		
	}
	
	public static void main(String[] args) {
		//Integer [] a =  {1, 2, 3, 4, 5, 4, 3, 2, 1, 3, 4};
		Integer [] a ={1, 4, 4, 4, 5, 3};
		System.out.println(migratoryBirds(Arrays.asList(a)));

	}

}
