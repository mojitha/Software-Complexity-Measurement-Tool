package com.controlstructure;

public class Test {

	public static String getRidOfQuotes(String line) {
		String newLine = line;
		String newa = "";
		
		try {
			int flag = 0;
			for(int i=0;i<newLine.length();i++) {
				
				if((newLine.charAt(i)+"").matches("[\"]")) {
					++flag;
				}
				
				if(flag%2 == 0)
					newa += newLine.charAt(i);
			}
		} catch(Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}
		
		String newestLine = newa.replaceAll("[\"]", "").trim();
		
		return newestLine;
	}
	
	public static void main(String[] args) {
		
		String Sa = "\"asdf\" "+12312+"\"sadfdsa\" twertere";
		String Sb = getRidOfQuotes(Sa);
		System.out.println(Sb);
	}

}
