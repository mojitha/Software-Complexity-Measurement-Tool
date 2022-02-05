package com.inheritance;

import java.util.Stack;

public class Test {
	static Stack<Character> stack = new Stack<>(); 
	
	public static void main(String[] args) {
		String input_A = "{{[[((";
		String input_B = "))]]}}";
		System.out.println(isClassOver(input_A));
		System.out.println(isClassOver(input_B));
	}
	
	public static boolean isClassOver(String l) {
		String input = l; 
		for (Character ch: input.toCharArray()) {
//			System.out.println(ch);
			if(ch == '{') {
				stack.push('}');
			}
			else if(ch == '[') {
				stack.push(']');
			}
			else if(ch == '(') {
				stack.push(')');
			}
			else {
				if(stack.isEmpty() || ch != stack.peek()) {
					return false;
				}
				stack.pop();
			}
		}
		
		return stack.isEmpty();
	}
}
