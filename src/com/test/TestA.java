package com.test;

public class TestA {

	public static void main(String[] args) {
		String a = "12sdfs";
		String b = "\\b([A-Za-z][A-Za-z0-9_]*)\\b";
		
		if(a.matches(b))
			System.out.println(true);
		else 
			System.out.println(false);
	}

}
