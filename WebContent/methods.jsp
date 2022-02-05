<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.io.File" %>
<%@ page import="java.io.FileNotFoundException" %>
<%@ page import="java.util.Scanner" %>
<%@ page import="com.user.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">

    <title>Methods</title>
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
			  <li class="nav-item active">
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
			  <li class="nav-item">
				<a class="nav-link" href="allfactors.jsp">All Factors</a>
			  </li>
			</ul>
		</div>
	  </div>
	</nav>
	
	<div class="container">
	<h1>Methods</h1>
		<table class="table table-bordered">
		  <thead>
			<tr>
			  <th scope="col">Line No</th>
			  <th scope="col">Program statements</th>
			  <th scope="col">Wmrt</th>
			  <th scope="col">Npdtv</th>
			  <th scope="col">Ncdtv</th>
			  <th scope="col">Cm</th>
			</tr>
		  </thead>
		  <tbody>
		  
		  
		  	<% 
					User user = User.getInstance();
					String fileDir = user.getFileDir();
					// out.print(fileDir);
					
					try {
						  String row = "row";
						  int count = 0;
					      File myObj = new File(fileDir);
					      Scanner myReader = new Scanner(myObj);
					      while (myReader.hasNextLine()) {
					        String data = myReader.nextLine();
					        out.print("<tr><th scope="+row+">"+(++count)+"</th><td>"+data+"</td></tr>");			  
					        //out.print("<br />");
					      }
					      myReader.close();
				    } catch (FileNotFoundException e) {
				      System.out.println("An error occurred.");
				      e.printStackTrace();
				    }
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