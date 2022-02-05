<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.io.File" %>
<%@ page import="java.io.FileNotFoundException" %>
<%@ page import="java.util.Scanner" %>
<%@ page import="java.util.List" %>
<%@ page import="com.user.*" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">

    <title>allfactors</title>
  </head>
  <body>
    
	<nav class="navbar navbar-expand-lg navbar-light bg-light">
	  
	  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
		<span class="navbar-toggler-icon"></span>
	  </button>

	  <div class="collapse navbar-collapse" id="navbarSupportedContent">
		<ul class="navbar-nav mr-auto">
			<a class="navbar-brand" href="#">CDE IT Solutions</a>
		</ul>
		
		<div class="my-2 my-lg-0">
		  	<ul class="navbar-nav mr-auto">
			  <li class="nav-item">
				<a class="nav-link" href="size.jsp">Size</a>
			  </li>
			  <li class="nav-item">
				<a class="nav-link" href="variables.jsp">Variables</a>
			  </li>
			  <li class="nav-item">
				<a class="nav-link" href="methods.jsp">Methods</a>
			  </li>
			  <li class="nav-item">
				<a class="nav-link" href="inheritance.jsp">Inheritance</a>
			  </li>
			  <li class="nav-item">
				<a class="nav-link" href="coupling.jsp">Coupling</a>
			  </li>
			  <li class="nav-item">
				<a class="nav-link" href="controlstructures.jsp">Control structures</a>
			  </li>
			  <li class="nav-item active">
				<a class="nav-link" href="allfactors.jsp">All Factors</a>
			  </li>
			</ul>
		</div>
	  </div>
	</nav>
	
	<div class="container">
	<h1>All Factors</h1>
		<table class="table table-bordered">
		  <thead>
			<tr>
			  <th scope="col">Line No</th>
			  <th scope="col">Program statements</th>
			  <th scope="col">Cs</th>
			  <th scope="col">Cv</th>
			  <th scope="col">Cm</th>
			  <th scope="col">Ci</th>
			  <th scope="col">Ccp</th>
			  <th scope="col">Ccs</th>
			  <th scope="col">TCps</th>
			</tr>
		  </thead>
		  <tbody>
			<% 
					User user = User.getInstance();
					String fileDir = user.getFileDir();
					List<Integer> CCSList = User.getCCSList();
					List<Integer> CIList = User.getCIList();
					List<Integer> CSList = User.getCSList();
					List<Integer> CVList = User.getCVList();
					int totCCS = 0;
					int totCI = 0;
					int totCS = 0;
					int totCV = 0;
					int totTCPS = 0;
					
					try {
						  String row = "row";
						  int count = 0;
					      File myObj = new File(fileDir);
					      Scanner myReader = new Scanner(myObj);
					      while (myReader.hasNextLine()) {
					        String data = myReader.nextLine();
					        int a = CSList.get(count);
					        int b = CVList.get(count);
					        int c = CIList.get(count);
					        int d = CCSList.get(count);
					        int tot = a + b + 0 + c + 0 + d;
					        totCS += a;
					        totCV += b;
					        totCI += c;
					        totCCS += d; 
					        totTCPS += tot;
					        out.print("<tr>");
				        	out.print("<th scope="+row+">"+(++count)+"</th>"); // LINE NO
		        			out.print("<td>"+data+"</td>"); // LINE
		        			out.print("<td>"+a+"</td>");
		        			out.print("<td>"+b+"</td>");
		        			out.print("<td>"+0+"</td>");
		        			out.print("<td>"+c+"</td>");
		        			out.print("<td>"+0+"</td>");
		        			out.print("<td>"+d+"</td>");
		        			out.print("<td>"+tot+"</td>");
		        			out.print("</tr>");
					      }
					}
					catch (FileNotFoundException e) {
						System.out.println("An error occurred.");
						e.printStackTrace();
					}
			%>
			<% 
				out.print("<tr>");
				out.print("<th scope=\"col\">---------</th>");
				out.print("<th scope=\"col\">- Total -</th>");
				out.print("<th scope=\"col\">"+totCS+"</th>");
				out.print("<th scope=\"col\">"+totCV+"</th>");
				out.print("<th scope=\"col\">"+0+"</th>");
				out.print("<th scope=\"col\">"+totCI+"</th>");
				out.print("<th scope=\"col\">"+0+"</th>");
				out.print("<th scope=\"col\">"+totCCS+"</th>");
				out.print("<th scope=\"col\">"+totTCPS+"</th>");
				out.print("</tr>");
			%>
		  </tbody>
		</table>
	</div>
	
    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
  </body>
</html>