package com.servlets;

import java.io.*;
import java.util.*;
 
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import com.user.User;

@WebServlet("/SaveSourceCodeServlet")
@MultipartConfig
public class SaveSourceCodeServlet extends HttpServlet {
	private User user = User.getInstance();
	
	private boolean isMultipart;
	private String filePath;
	private int maxFileSize = 50 * 1024;
	private int maxMemSize = 4 * 1024;
	private File file ;
	
	private static final long serialVersionUID = 1L;

	public void init() {
		// Get the file location where it would be stored.
    	filePath = getServletContext().getInitParameter("file-upload"); 
    	user.setFilePath(filePath);
	}
	
    public SaveSourceCodeServlet() {}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Check that we have a file upload request
	      isMultipart = ServletFileUpload.isMultipartContent(request);
	      response.setContentType("text/html");
	      java.io.PrintWriter out = response.getWriter( );
	   
	      if( !isMultipart ) {
	         out.println("<html>");
	         out.println("<head>");
	         out.println("<title>Servlet upload</title>");  
	         out.println("</head>");
	         out.println("<body>");
	         out.println("<p>No file uploaded</p>"); 
	         out.println("</body>");
	         out.println("</html>");
	         return;
	      }
	  
	      DiskFileItemFactory factory = new DiskFileItemFactory();
	   
	      // maximum size that will be stored in memory
	      factory.setSizeThreshold(maxMemSize);
	   
	      // Location to save data that is larger than maxMemSize.
	      factory.setRepository(new File("c:\\temp"));

	      // Create a new file upload handler
	      ServletFileUpload upload = new ServletFileUpload(factory);
	   
	      // maximum file size to be uploaded.
	      upload.setSizeMax( maxFileSize );

	      try { 
	         // Parse the request to get file items.
	         List fileItems = upload.parseRequest(request);
		
	         // Process the uploaded file items
	         Iterator i = fileItems.iterator();

	         out.println("<html>");
	         out.println("<head>");
	         out.println("<title>Servlet upload</title>");  
	         out.println("</head>");
	         out.println("<body>");
	   
	         while ( i.hasNext () ) {
	            FileItem fi = (FileItem)i.next();
	            if ( !fi.isFormField () ) {
	               // Get the uploaded file parameters
	               String fieldName = fi.getFieldName();
	               String fileName = fi.getName();
	               String contentType = fi.getContentType();
	               boolean isInMemory = fi.isInMemory();
	               long sizeInBytes = fi.getSize();
	            
	               // Write the file
	               if( fileName.lastIndexOf("\\") >= 0 ) {
	            	   String[] nameArr = fileName.split("\\\\");
	            	   user.setFileName(nameArr[nameArr.length-1]);
	            	   file = new File( filePath + fileName.substring( fileName.lastIndexOf("\\"))) ;
	                  user.setFileDir( new File(user.getFilePath(),user.getFileName()).toString() );
	               } 
	               else {
	                  file = new File( filePath + fileName.substring(fileName.lastIndexOf("\\")+1)) ;
	               }
	               fi.write( file ) ;
	               out.println("Uploaded Filename: " + fileName + "<br>");
	               out.println("<a href=\"welcome.jsp\">GO</a>");
	               System.out.println(fileName);
	            }
	         }
	         out.println("</body>");
	         out.println("</html>");
	         
	         Thread.sleep(3000);
	         
	         //request.getRequestDispatcher("welcome.jsp").forward(request, response);
	      } 
	      catch(Exception ex) {
	    	  System.out.println(ex);
	      }
	}
}
