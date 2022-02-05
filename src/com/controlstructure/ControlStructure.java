package com.controlstructure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

import com.user.User;
import com.utility.CleanLine;

public class ControlStructure {
	static Stack<Character> stack = new Stack<>();
	static boolean insideStructure = false;
	static User u = User.getInstance();
	
	public static int getWTCS(String line) {
		int count = 0;
		String newLineA = CleanLine.getCleanLine(line);
		String newLine = CleanLine.getRidOfQuotes(newLineA);
		
//		System.out.println(newLine);
		
		if(newLine.contains(" if ") ||
			newLine.contains("if(") || 
			newLine.contains("}if(") || 
			newLine.contains("}if (") ||
			
			newLine.contains(" else if ") || 
			newLine.contains("else if(") || 
			newLine.contains("}else if(") || 
			newLine.contains("else if (")) {
			count += Integer.parseInt(u.getControlStructuresIF());
		}
		if(newLine.contains(" switch ") ||
			newLine.contains("switch ") ||
			newLine.contains("switch(") ||
			newLine.contains("}switch(") || 
			newLine.contains("}switch (")) {
			count += Integer.parseInt(u.getControlStructuresSWI());
		}
		if(newLine.contains(" case ") ||
			newLine.contains("case")) {
			count += Integer.parseInt(u.getControlStructuresCASE());
		}
		if(newLine.contains(" for ") ||
			newLine.contains("for(") || 
			newLine.contains("}for(") || 
			newLine.contains("}for (") || 

			newLine.contains(" while ") ||
			newLine.contains("while(") || 
			newLine.contains("}while(") || 
			newLine.contains("}while (")) {
			count += Integer.parseInt(u.getControlStructuresLOOP());
		}
		
		return count;
	}
	
	public static int getNC(String line) {
		int count = 0;
		String newLineA = CleanLine.getCleanLine(line);
		String newLine = CleanLine.getRidOfQuotes(newLineA);
		boolean isControl = false;
		
		if(newLine.contains(" if ") ||
			newLine.contains("if(") || 
			newLine.contains("}if(") || 
			newLine.contains("}if (") ||
			
			newLine.contains(" else if ") || 
			newLine.contains("else if(") || 
			newLine.contains("}else if(") || 
			newLine.contains("else if (")) {
			isControl = true;
		}
		if(newLine.contains(" for ") ||
			newLine.contains("for(") || 
			newLine.contains("}for(") || 
			newLine.contains("}for (") || 

			newLine.contains(" while ") ||
			newLine.contains("while(") || 
			newLine.contains("}while(") || 
			newLine.contains("}while (")) {
			isControl = true;
		}
		if(newLine.contains(" switch ") ||
			newLine.contains("switch(") ||
			newLine.contains("}switch(") || 
			newLine.contains("}switch (")) {
			isControl = true;
		}
		
		if(isControl || isOutsideConditions(newLine)) {
			String regA = "[&|][&|]";
			
			List<String> myArr = new ArrayList<>();
			myArr.addAll(Arrays.asList(newLine.replaceAll("[\"]", " ").replaceAll("[a-zA-Z0-9*][;]", " ").trim().split(" ")));
			System.out.println(myArr);
			for (String y : myArr) {
				if(y.matches(regA)) {
					System.out.println(y);
					count++;
				}
			}
			
			count++;
		}
		
		return count;
	}
	
	public static boolean isOutsideConditions(String l) {
		String input = l; 
		for (Character ch: input.toCharArray()) {
//			System.out.println(ch);
			if(ch == '(') {
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
	
	public static int getCCSPS(String line) {
		int count = 0;
		String newLineA = CleanLine.getCleanLine(line);
		String newLine = CleanLine.getRidOfQuotes(newLineA);
		
		if(newLine.contains(" if ") ||
			newLine.contains("if(") || 
			newLine.contains("}if(") || 
			newLine.contains("}if (") ||
			
			newLine.contains(" else if ") || 
			newLine.contains("else if(") || 
			newLine.contains("}else if(") || 
			newLine.contains("else if (")) {
			
			if(isInsideStructure(newLine)) {
				count = 0;
			} else {
				count = Integer.parseInt(u.getControlStructuresIF());
			}
		}
		if(newLine.contains(" switch ") ||
			newLine.contains("switch ") ||
			newLine.contains("switch(") ||
			newLine.contains("}switch(") || 
			newLine.contains("}switch (")) {
			
			if(isInsideStructure(newLine)) {
				count = 0;
			} else {
				count = Integer.parseInt(u.getControlStructuresSWI());
			}
		}
		if(newLine.contains(" case ") ||
			newLine.contains("case")) {
			if(isInsideStructure(newLine)) {
				count = 0;
			} else {
				count = Integer.parseInt(u.getControlStructuresCASE());
			}
		}
		if(newLine.contains(" for ") ||
			newLine.contains("for(") || 
			newLine.contains("}for(") || 
			newLine.contains("}for (") || 

			newLine.contains(" while ") ||
			newLine.contains("while(") || 
			newLine.contains("}while(") || 
			newLine.contains("}while (")) {
			
			if(isInsideStructure(newLine)) {
				count = 0;
			} else {
				count = Integer.parseInt(u.getControlStructuresLOOP());
			}
		}
		
		return count;
	}
	
	public static boolean isInsideStructure(String l) {
		String input = l; 
		for (Character ch: input.toCharArray()) {
//			System.out.println(ch);
			if(ch == '{') {
				stack.push('}');
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
	
	public static int getCCS(int a, int b, int c) {
		// Ccs= (Wtcs* NC) +Ccspps
		return ( (a * b) + c );
	}
	
//	public static void main(String[] args) {
//		int wtcsA = getWTCS("if( String a = \"if(\"; { // this is some bs inside A");
//		System.out.println(wtcsA);
//		
//		int wtcsB = getWTCS(" }if( { // this is some bs inside B");
//		System.out.println(wtcsB);
//		
//		int wtcsC = getWTCS("else if( { // this is some bs inside C");
//		System.out.println(wtcsC);
//		
//		int wtcsD = getWTCS(" }else if( { // this is some bs inside D");
//		System.out.println(wtcsD);
//		
//		int wtcsE = getWTCS("while( { // this is some bs inside E");
//		System.out.println(wtcsE);
//		
//		int wtcsF = getWTCS(" }while( { // this is some bs inside F");
//		System.out.println(wtcsF);
//		
//		int wtcsG = getWTCS("for( { // this is some bs inside G");
//		System.out.println(wtcsG);
//		
//		int wtcsH = getWTCS(" }for( { // this is some bs inside H");
//		System.out.println(wtcsH);
//		
//		int wtcsI = getWTCS("switch( { // this is some bs inside I");
//		System.out.println(wtcsI);
//		
//		int wtcsJ = getWTCS(" }switch( { // this is some bs inside J");
//		System.out.println(wtcsJ);
//		
//		int wtcsK = getWTCS("switch( { // this is some bs inside K");
//		System.out.println(wtcsK);
//		
//		int wtcsL = getWTCS(" }switch( { // this is some bs inside L");
//		System.out.println(wtcsL);
//		
//		int wtcsM = getWTCS(" case // this is some bs inside M");
//		System.out.println(wtcsM);
//		
//		int wtcsN = getWTCS("case( // this is some bs inside N");
//		System.out.println(wtcsN);
//	}
}
