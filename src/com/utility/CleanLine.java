package com.utility;

public class CleanLine {
	public static String getCleanLine(String line) {
		String cleanLine = line;
		
		if(line.contains("//")) {
			if(cleanLine.contains("public class"))
				cleanLine = cleanLine.replace("public class", "class");
			String comment = cleanLine.substring(cleanLine.indexOf("/", 0) , cleanLine.length());
			cleanLine = cleanLine.replace(comment, " ");
		}
		
		return cleanLine;
	}
	
	public static String getCleanLineForKeywords(String line) {
		String cleanLine = line;
		
		if(line.contains("//")) {
			String comment = cleanLine.substring(cleanLine.indexOf("/", 0) , cleanLine.length());
			cleanLine = cleanLine.replace(comment, " ");
		}
		
		return cleanLine;
	}
	
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
}
