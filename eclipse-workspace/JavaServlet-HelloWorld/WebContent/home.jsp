<%@page import="java.util.ArrayList"%>
<%@ page import="java.io.*"%>
<%@ page import="java.util.List"%>

<!DOCTYPE html>
<html>
  <head>
     <meta charset="UTF-8">
     <title>Simple Web Application</title>
  </head>
  
  <body>
  
     <h2>Simple Login Web Application using JSP/Servlet</h2>
      
     <ul>
        <li><a href="home">Home</a></li>
        <li><a href="login">Login</a></li>
        <li><a href="productList">Product  List</a>
     </ul>
      
      
      
     <div>${requestScope.name}</div>
     
      <%
      
      for(int i =0; i < 200; i++) {
     	 System.out.print(i);
      }
      
      %>
     
    
     <%
     List<String> list = (List<String>) request.getAttribute("listName");
     
     for(String s : list) {
    	 System.out.println(s);
     }
     
   
     %>
  </body>
</html>