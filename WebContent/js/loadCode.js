const coded = "package com.A;\r\n" + 
			"\r\n" + 
			"import java.lang.annotation.Annotation;\r\n" + 
			"import java.lang.reflect.*;\r\n" + 
			"\r\n" + 
			"public class Sandeep {\r\n" + 
			"	Integer i = 10;\r\n" + 
			"	String string1 = \"turorialspoint\";\r\n" + 
			"	static int countA = 0;\r\n" + 
			"	static int countB = 0;\r\n" + 
			"	\r\n" + 
			"	public static void main(String[] args) {\r\n" + 
			"		Sandeep s1 = new Sandeep();\r\n" + 
			"		Class<? extends Sandeep> n1 = s1.getClass();\r\n" + 
			"		System.out.println(n1);\r\n" + 
			"		\r\n" + 
			"		Method[] methods = n1.getDeclaredMethods();\r\n" + 
			"		for(int i=0 ; i < methods.length ; i++) {\r\n" + 
			"			System.out.println(\"method = \"+methods[i].toString());\r\n" + 
			"			countA++;\r\n" + 
			"		}\r\n" + 
			"		\r\n" + 
			"		Field[] fields = n1.getDeclaredFields();\r\n" + 
			"		for(int j=0 ; j < fields.length ; j++) {\r\n" + 
			"			System.out.println(\"method = \"+fields[j].toString());\r\n" + 
			"			countB++;\r\n" + 
			"		}\r\n" + 
			"		\r\n" + 
			"		System.out.println(\"Number of methods : \"+countA);\r\n" + 
			"		System.out.println(\"Number of attributes : \"+countB);\r\n" + 
			"	}\r\n" + 
			"	\r\n" + 
			"	public Sandeep() {\r\n" + 
			"		// \r\n" + 
			"	}\r\n" + 
			"	\r\n" + 
			"	public void showsString(String string1) {\r\n" + 
			"		int i1 = 0;\r\n" + 
			"		this.string1 = string1;\r\n" + 
			"	}\r\n" + 
			"\r\n" + 
			"	public void showsInteger(Integer i) {\r\n" + 
			"		this.i = i;\r\n" + 
			"	}\r\n" + 
			"}\r\n" + 
			"";
			
			console.log(coded);
			const lines = coded.split("\n");
			const row = "row";
			const table = document.querySelector("#sizeTable");
			const tableBody = table.querySelector("#sizeTableBody");
			lines.forEach((line,index) => {
				console.log(line)
				tableBody.innerHTML += "<tr><th scope="+row+">"+(++index)+"</th><td>"+line+"</td><td></td><td></td><td></td><td></td><td></td><td></td></tr>";
			});