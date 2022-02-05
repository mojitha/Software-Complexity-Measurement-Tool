package com.size;

import java.util.ArrayList;
import java.util.List;

public class TestSize {
	public static void main(String[] args) {
		List<String> a = new ArrayList<>();
		a.add("Class");
		String b = "class";
		
		System.out.println(a.contains(b));
	}
}
