package com.app;

public class ExceptionExample {
	
	static boolean test(){
		try{
			throw new Exception();
		}catch(Exception e){
			return true;
		}finally{
			System.out.println("Test");
			return false;
			
		}
	}
	
	public static void main(String[] args){
		System.out.println(test());
	}

}
