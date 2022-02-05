package com.servlets;

import java.io.IOException;
import java.util.Enumeration;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.user.User;

@WebServlet("/SetWeightsServlet")
public class SetWeightsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	User u = User.getInstance();
	
    public SetWeightsServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		java.io.PrintWriter out = response.getWriter( );
		Enumeration<String> parameterNames = request.getParameterNames();
		 
        while (parameterNames.hasMoreElements()) {
            String paramName = parameterNames.nextElement();
            String[] paramValues = request.getParameterValues(paramName);
            
            for (int i = 0; i < paramValues.length; i++) {
                String paramValue = paramValues[i];
                System.out.println(paramName + " " + paramValue);
                
                switch(paramName) {
					case "sizeKW":
						u.setSizeKW(paramValue);
						break;
					case "sizeID":
						u.setSizeID(paramValue);
						break;
					case "sizeOP":
						u.setSizeOP(paramValue);
						break;
					case "sizeNV":
						u.setSizeNV(paramValue);
						break;
					case "sizeSL":
						u.setSizeSL(paramValue);
						break;
					case "variableGV":
						u.setVariableGV(paramValue);
						break;
					case "variableLV":
						u.setVariableLV(paramValue);
						break;
					case "variablePTV":
						u.setVariablePTV(paramValue);
						break;
					case "variableCTV":
						u.setVariableCTV(paramValue);
						break;
					case "methodPRT":
						u.setMethodPRT(paramValue);
						break;
					case "methodCRT":
						u.setMethodCRT(paramValue);
						break;
					case "methodVRT":
						u.setMethodVRT(paramValue);
						break;
					case "methodPDTP":
						u.setMethodPDTP(paramValue);
						break;
					case "methodCDTP":
						u.setMethodCDTP(paramValue);
						break;
					case "inheritanceNI":
						u.setInheritanceNI(paramValue);
						break;
					case "inheritanceFLI":
						u.setInheritanceFLI(paramValue);
						break;
					case "inheritanceSLI":
						u.setInheritanceSLI(paramValue);
						break;
					case "inheritanceTLI":
						u.setInheritanceTLI(paramValue);
						break;
					case "inheritanceOLI":
						u.setInheritanceOLI(paramValue);
						break;
					case "controlStructuresIF":
						u.setControlStructuresIF(paramValue);
						break;
					case "controlStructuresLOOP":
						u.setControlStructuresLOOP(paramValue);					
						break;
					case "controlStructuresSWI":
						u.setControlStructuresSWI(paramValue);
						break;
					case "controlStructuresCASE":
						u.setControlStructuresCASE(paramValue);
						break;
					default:
						break;
				}
                
            }
            
        }
		
		System.out.println(u.toString());
		
		out.println("Weights saved. <br>");
        out.println("<a href=\"index.jsp\">GO</a>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
}
