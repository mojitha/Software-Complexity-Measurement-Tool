package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.strings.Keywords;

public class Test {
	public static void main(String[] args) {
		int count = 0;
		String[] kArr = Keywords.KEYWORDS;
		String x = ("public static void main(String[] void)").replaceAll("[()]", " ");
		List<String> myArr = new ArrayList<>();
		myArr.addAll(Arrays.asList(x.split(" ")));
		
		for (String y : myArr) {
			System.out.println(y);
			if(Arrays.asList(kArr).contains(y)) {
				++count;
			}
		}
		
		System.out.println("Count of NKW: "+count);
	}
}
