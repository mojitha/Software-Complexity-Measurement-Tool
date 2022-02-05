package com.size;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.strings.Keywords;
import com.user.User;
import com.utility.CleanLine;

public class Size {
	static User u = User.getInstance();
	
	public static int getNKW(String line) {
		int count = 0;
		String[] kArr = Keywords.KEYWORDS;
		String newLineA = CleanLine.getCleanLineForKeywords(line);
		String newLineB = CleanLine.getRidOfQuotes(newLineA);
		String x = newLineB.replaceAll("[()]", " ");
		
		List<String> myArr = new ArrayList<>();
		myArr.addAll(Arrays.asList(x.split(" ")));
		
		for (String y : myArr) {
			if(Arrays.asList(kArr).contains(y)) {
				count += Integer.parseInt(u.getSizeKW());
			}
		}
		
		return count;
	}
	
	public static int getNID(String line) {
		int count = 0;
		String[] kArr = Keywords.KEYWORDS;
		String idReg = "\\b([A-Za-z][A-Za-z0-9$_]*)\\b";
		String arrReg = "\\$[^\\$]*+\\$";
		
		String regex = "\"(?:\\\\\"|[^\"])*?\"";
		String replacement = "\"\"";
		String newLineA = CleanLine.getCleanLineForKeywords(line);
		String newLineB = CleanLine.getRidOfQuotes(newLineA);
		String x = newLineB.replaceAll(regex, replacement).replaceAll("[()\\.][;]", " ");
		
		List<String> myArr = new ArrayList<>();
		myArr.addAll(Arrays.asList(x.trim().split(" ")));
//		System.out.println(myArr);
		for (String y : myArr) {
			if( (!Arrays.asList(kArr).contains(y)) && (y.matches(idReg) || y.matches(arrReg)) ) {
//				System.out.println(y);
				count += Integer.parseInt(u.getSizeID());
			}
		}
		
		return count;
	}
	
	public static int getNOP(String line) {
		int count = 0;
		String[] kArr = Keywords.KEYWORDS;
		
		String regA = "[+-=\\/*%]";
		String regB = "[+-][+-]";
		String regC = "[+-\\/*%=<>!|&^][=]";
		String regD = "[<>]";
		String regE = "[&|][&|]";
		String regF = "[!]";
		String regG = "[|^~]";
		String regH = "[<>][<>]";
		String regI = "[<>][<>][<>]";
		String regJ = "[>][>][>][=]";
		String regK = "[<>][<>][=]";
		String regL = "[:-][:>]";
		String regM = "[,.]";
		String regN = "[a-zA-Z][+-][+-]";
		
		List<String> myArr = new ArrayList<>();
		String newLineA = CleanLine.getCleanLineForKeywords(line);
		String newLineB = CleanLine.getRidOfQuotes(newLineA);
		myArr.addAll(Arrays.asList(newLineB.replaceAll("[\"]", " ").replaceAll("[a-zA-Z0-9*][;]", " ").trim().split(" ")));
		System.out.println(myArr);
		for (String y : myArr) {
			if( (!Arrays.asList(kArr).contains(y)) ) {
				if(y.matches(regA) || 
					y.matches(regB) || 
					y.matches(regC) || 
					y.matches(regD) || 
					y.matches(regE) ||
					y.matches(regF) ||
					y.matches(regG) ||
					y.matches(regH) ||
					y.matches(regI) ||
					y.matches(regJ) ||
					y.matches(regK) ||
					y.matches(regL) ||
					y.matches(regM) ||
					y.matches(regN))  
				{
					System.out.println(y);
					count += Integer.parseInt(u.getSizeOP());
				}
			}
		}
		
		return count;
	}
	
	public static int getNNV(String line) {
		int count = 0;
		String newLineA = CleanLine.getCleanLineForKeywords(line);
		String newLineB = CleanLine.getRidOfQuotes(newLineA);
		String regNumeric = "[+-]?([0-9]*[.])?[0-9]+";
		
		List<String> myArr = new ArrayList<>();
		myArr.addAll(Arrays.asList(newLineB.replaceAll("[[()],;\"]", " ").replaceAll("[a-zA-Z*][;]", " ").trim().split(" ")));
		System.out.println(myArr);
		for (String y : myArr) {
			if(y.matches(regNumeric)) {
				System.out.println(y);
				count += Integer.parseInt(u.getSizeNV());
			}
		}
		
		return count;
	}
	
	public static int getNSL(String line) {
		int count = 0;
		
		String newLineA = CleanLine.getCleanLineForKeywords(line);
		String newLine = newLineA;
		
		for(int i=0;i<newLine.length();i++) {
			if((newLine.charAt(i)+"").matches("[\"]"))
				count += Integer.parseInt(u.getSizeSL());
		}
		
		return count/2;
	}
	
	public static int getCS(int a, int b, int c, int d, int e, int f, int g, int h, int i, int j) {
		//Cs= (Wkw* Nkw)+ (Wid* Nid)+ (Wop* Nop)+ (Wnv* Nnv)+ (Wsl* Nsl)
		return ( (a * b) + (c * d) + (e * f) + (g * h) + (i * j) );
	}
	
	public static void main(String[] args) {
//		String a = " \"Hello\" \"How\" \"are\" \"you?\" //asdfsfasadfasfas ";
//		System.out.println(getNSL(a));
		
//		String a = "assdaf 123 1.23)";
//		System.out.println(getNNV(a));
	}
}
