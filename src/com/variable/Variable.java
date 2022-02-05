package com.variable;

import java.util.Arrays;

import com.utility.CleanLine;

public class Variable {
	static String[] primitiveTypes = {"byte","short","int","long","float","double","boolean","char"};
	static int oe = 0;
	
	public static int getWVS(String line) {
		String newLine_1 = CleanLine.getCleanLine(line);
		String newLine = newLine_1.replaceAll("[;]", "");
		return getScope(newLine);
	}
	
	public static int getNPDTV(String line) {
		String newLine_1 = CleanLine.getCleanLine(line);
		String newLine = newLine_1.replaceAll("[;]", "");
		String[] words = newLine.split(" ");
		boolean isVariable = isVariable(newLine);
		boolean isPrimitive = false;
		
		if(isVariable) {
			for (String w : words)
				if(Arrays.asList(primitiveTypes).contains(w))
					isPrimitive = true;
		}
		
		return (isVariable && isPrimitive) ? 1 : 0;
	}

	public static int getNCDTV(String line) {
		String newLine_0 = CleanLine.getCleanLine(line);
		String newLine_1 = newLine_0.replaceAll("[{,;]", "");
		String newLine = newLine_1.replaceAll("[},;]", "");
		System.out.println(newLine);
		String[] words = newLine.split(" ");
		boolean isVariable = isVariable(newLine);
		boolean isComposite = false;
		
		if(isVariable) {
			for (String w : words)
				if(w.contains("[]"))
					isComposite = true;
		}
		
		return isComposite ? 1 : 0;
	}
	
	public static int getCV(int a, int b, int c, int d, int e) {
		//Cv= Wvs[(Wpdtv* Npdtv) + (Wcdtv* Ncdtv)]
		return a * ( (b * c) + (d * e) ); 
	}
	
	public static int getScope(String line) {
		int s = 0;
		// checks if global - 2
		if(handleStack(line) == 1) {
			// checks if contains variable
			if(isVariable(line))
				return 2;
			else
				return s;
		}
		// else local - 1
		else {
			// checks if contains variable
			if(isVariable(line))
				return 1;
			else
				return s;
		}
	}
	
	public static boolean isVariable(String l) {
		String line = l.replaceAll("[\"]", "");
		String[] sArr = line.split(" ");
		int c = 0;
		boolean valid = false;
		
		for (String s : sArr) {
			if(s.matches("\\b[a-z][a-zA-Z0-9$_]*\\b") || 
				s.matches("\\b[a-zA-Z0-9$_]*\\b[<][a-zA-Z0-9$_]*[>]"))
				if(!s.equals("for") && !s.contains("for("))
					c++;
			if(s.matches("[=]") || s.contains("=")) {
				if(!s.contains("==")) {
					c++;
					valid = true;
				}
			}
		}
		
		System.out.println(c);
		return valid && c >= 3;
	}
	
	public static int handleStack(String l) {
		String input = l; 
		for (Character ch: input.toCharArray()) {
			if(ch == '{') {
				oe++;
			}
			else if(ch == '}') {
				oe--;
			}
		}
		
		return oe;
	}
	
	public static void main(String[] args) {
//		getWVS("dasfsd = \"asdfsadfsa\"; //asdfsdafsdasds");
//		System.out.println(handleStack("{{{}"));
//		System.out.println(handleStack("}}}{"));
//		System.out.println(isVariable("int<sdf> a = \"1231sdadf\""));
//		System.out.println(isVariable("int a = \"1231sdadf\""));
//		System.out.println(isVariable("ArrayList<String> a = \"1231sdadf\""));
		
//		String a = "public class Hello {\r\n" + 
//				"	// asdfdasdfa\r\n" + 
//				"}\r\n" + 
//				"\r\n" + 
//				"class A {\r\n" + 
//				"	private int a = \"sdfas\";\r\n" + 
//				"}\r\n" + 
//				"\r\n" + 
//				"class B {\r\n" + 
//				"	public void A() {\r\n" + 
//				"		int c = 2;\r\n" + 
//				"	}\r\n" + 
//				"}";
//		
//		System.out.println(isVariable(a));
		String a = "String[] asd = {ad,sadf,asdf}; //saddsafd";
		System.out.println(getNCDTV(a));
	}
}
